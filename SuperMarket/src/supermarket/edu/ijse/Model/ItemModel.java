/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Model;
import java.util.List;
import supermarket.edu.ijse.DBConnection.DBConnection;
import supermarket.edu.ijse.Dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author dinuka
 */
public class ItemModel {
    public List<ItemDto> getAllItem() throws ClassNotFoundException, SQLException{
        String quere = "Select * From Item";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareCall(quere);
        
        ResultSet res = stm.executeQuery();
        List<ItemDto> dtos = new ArrayList<>();
        if(res.next()){
            while(res.next()){
                ItemDto dto = new ItemDto(
                        res.getString("ItemCode"),
                        res.getString("Description"),
                        res.getString("PackSize"),
                        res.getDouble("UnitPrice"),
                        res.getInt("QtyOnHand")
                );
                dtos.add(dto);
            }
            return dtos;
        }
        return null;
    }
    
    public boolean saveItem(ItemDto dto) throws ClassNotFoundException, SQLException{
        String quere = "INSERT INTO Item VALUES (?,?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(quere);
        
        stm.setString(1, dto.getItemId());
        stm.setString(2, dto.getDescription());
        stm.setString(3, dto.getPackSize());
        stm.setDouble(4, dto.getPrice());
        stm.setInt(5, dto.getQty());
        
        int res = stm.executeUpdate();
        return (res != 0)? true :false;
    }
    
    public ItemDto searchItem(String id) throws ClassNotFoundException, SQLException{
        String queree = "Select * FROM Item Where ItemCode = ?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(queree);
        
        stm.setString(1, id);
        
        ResultSet res = stm.executeQuery();
        if(res.next()){
            ItemDto dto = new ItemDto(
                res.getString("ItemCode"),
                res.getString("Description"),
                res.getString("PackSize"),
                res.getDouble("UnitPrice"),
                res.getInt("QtyOnHand")
            );
            return dto;
        }
        return null;
    }
    
    public boolean itemUpdate(ItemDto dto) throws ClassNotFoundException, SQLException{
        Connection con = DBConnection.getInstance().getConnection();
        String queree = "UPDATE Item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? where ItemCode = ?";
        PreparedStatement stm = con.prepareStatement(queree);
        
        stm.setString(1, dto.getDescription());
        stm.setString(2, dto.getPackSize());
        stm.setDouble(3, dto.getPrice());
        stm.setInt(4, dto.getQty());
        stm.setString(5, dto.getItemId());
        
        int res = stm.executeUpdate();
        return (res >0)? true: false;
    }
    
    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException{
        Connection con = DBConnection.getInstance().getConnection();
        String quere = "DELETE FROM Item Where ItemCode = ?";
        PreparedStatement stm = con.prepareStatement(quere);
        
        stm.setString(1, id);
        
        int res = stm.executeUpdate();
        return (res > 0 )? true: false;
    }
}
