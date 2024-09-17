/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Model;
import java.util.List;
import supermarket.edu.ijse.Dto.CustomerDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import supermarket.edu.ijse.DBConnection.DBConnection;
/**
 *
 * @author dinuka
 */
public class CustomerModel {
    public List<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
        String quere = "Select * From Customer";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(quere);
        
        List<CustomerDto> dtos = new ArrayList<>();
        ResultSet res = stm.executeQuery();
        
        if(res.next()){
            while(res.next()){
                CustomerDto dto = new CustomerDto(
                        res.getString("CustID"),
                        res.getString("CustTitle"),
                        res.getString("CustName"),
                        res.getString("DOB"),
                        res.getDouble("salary"),
                        res.getString("CustAddress"),
                        res.getString("City"),
                        res.getString("Province"),
                        res.getString("PostalCode")
                );
                
                dtos.add(dto);
            }
            
            return dtos;
        }
        
        return null;
    }
    
    public boolean saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException{
        String queree = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(queree);
        
        stm.setString(1, dto.getCustID());
        stm.setString(2, dto.getCustTitle());
        stm.setString(3, dto.getCustName());
        stm.setString(4, dto.getDOB());
        stm.setDouble(5, dto.getSalary());
        stm.setString(6, dto.getCustAddress());
        stm.setString(7, dto.getCity());
        stm.setString(8, dto.getProvince());
        stm.setString(9, dto.getPostalCode());
        
        int resp = stm.executeUpdate();
        return (resp != 0)? true : false;
    }
    
    public boolean updateCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException{
        String queree = "Update Customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?";
        Connection connetion = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connetion.prepareStatement(queree);
        
        stm.setString(9, dto.getCustID());
        stm.setString(1, dto.getCustTitle());
        stm.setString(2, dto.getCustName());
        stm.setString(3, dto.getDOB());
        stm.setDouble(4, dto.getSalary());
        stm.setString(5, dto.getCustAddress());
        stm.setString(6, dto.getCity());
        stm.setString(7, dto.getProvince());
        stm.setString(8, dto.getPostalCode());
        
        int res = stm.executeUpdate();
        return (res != 0)? true : false;
    }
    
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        String quere = "Delete From Customer WHERE CustID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(quere);
        
        stm.setString(1, id);
        
        int resp = stm.executeUpdate();
        return (resp != 0)? true : false;
    }
    
    public CustomerDto searchCust(String id) throws ClassNotFoundException, SQLException{
        String quere = "Select * From Customer WHERE CustID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(quere);
        
        stm.setString(1, id);
        
        ResultSet res = stm.executeQuery();
        if(res.next()){
            CustomerDto dto = new CustomerDto(
                    res.getString("CustID"),
                    res.getString("CustTitle"),
                    res.getString("CustName"),
                    res.getString("DOB"),
                    res.getDouble("salary"),
                    res.getString("CustAddress"),
                    res.getString("City"),
                    res.getString("Province"),
                    res.getString("PostalCode")
            );
            
            return dto;
        }
        return null;
    }
}
