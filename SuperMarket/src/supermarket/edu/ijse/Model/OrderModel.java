/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Model;
import supermarket.edu.ijse.Dto.OrderDto;
import supermarket.edu.ijse.Dto.OrderDetailDto;
import java.sql.Connection;
import javax.swing.JOptionPane;
import supermarket.edu.ijse.DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author dinuka
 */
public class OrderModel {
    public String placeOrder(OrderDto dto) throws SQLException, ClassNotFoundException{
        Connection con = DBConnection.getInstance().getConnection();
        dto.toString();
        try{
            con.setAutoCommit(false);
            
            String ordersQueree = "INSERT INTO Orders VALUES(?,?,?)";
            PreparedStatement orderStm = con.prepareStatement(ordersQueree);
            
            orderStm.setString(1, dto.getOrderId());
            orderStm.setString(2, dto.getDate());
            orderStm.setString(3, dto.getCustId());
            
            boolean isOrderSaved = orderStm.executeUpdate() > 0;
            
            if(isOrderSaved){
                boolean isOrderDetailSaved = true;
                for(OrderDetailDto detailDto : dto.getOrderDetailDto()){
                    String orderDetailQuere = "INSERT INTO OrderDetail VALUES(?,?,?,?)";
                    PreparedStatement orderDetailStm = con.prepareStatement(ordersQueree);
                    
                    orderDetailStm.setString(1, dto.getOrderId());
                    orderDetailStm.setString(2, detailDto.getItemId());
                    orderDetailStm.setInt(3, detailDto.getQty());
                    orderDetailStm.setInt(4, detailDto.getDiscount());
                    
                    if(!(orderDetailStm.executeUpdate()> 0)){
                        isOrderDetailSaved = false;
                    }
                }
                
                if(isOrderDetailSaved){
                    boolean isItemUpdated = true;
                        for(OrderDetailDto orderDetail: dto.getOrderDetailDto()){
                            String itemQuere = "UPDATE Item SET QtyOnHand = QtyOnHand - ? Where ItemCode = ?";
                            PreparedStatement itemStm = con.prepareStatement(itemQuere);
                            
                            itemStm.setInt(1, orderDetail.getQty());
                            itemStm.setString(2, orderDetail.getItemId());
                    
                            if(!(itemStm.executeUpdate()>0)){
                                    isItemUpdated = false;
                                }
                        }

                    if(isItemUpdated){
                        con.commit();
                        return "Saved";
                    } else {
                        con.rollback();
                        return "Item update Error";
                    }
                    
                } else {
                    con.rollback();
                    return "Order Detail Save Error";
                }
                
            } else {
                con.rollback();
                return "Order Save Error";
            }
            
        } catch (Exception e) {
            con.rollback();
            throw e;
        } finally {
            con.setAutoCommit(true);
        }
    }
}
