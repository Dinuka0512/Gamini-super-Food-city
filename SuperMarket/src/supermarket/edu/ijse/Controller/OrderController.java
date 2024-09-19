/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Controller;
import java.sql.SQLException;
import supermarket.edu.ijse.Dto.OrderDto;
import supermarket.edu.ijse.Model.OrderModel;
/**
 *
 * @author dinuka
 */
public class OrderController {
    OrderModel orderModel = new OrderModel();
    public String placeOrder(OrderDto dto) throws SQLException, ClassNotFoundException{
       String res = orderModel.placeOrder(dto);
       return res;
    }
}
