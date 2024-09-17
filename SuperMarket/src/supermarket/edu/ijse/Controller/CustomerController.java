/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Controller;
import java.sql.SQLException;
import java.util.List;
import supermarket.edu.ijse.Model.CustomerModel;
import supermarket.edu.ijse.Dto.CustomerDto;
/**
 *
 * @author dinuka
 */
public class CustomerController {
    private CustomerModel custmodel = new CustomerModel();
    
    public List<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
        List<CustomerDto> dtos = custmodel.getAll();
        return dtos;
    }
    
    public boolean saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException{
        boolean resp = custmodel.saveCustomer(dto);
        return resp;
    }
    
    public boolean updateCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException{
        boolean res = custmodel.updateCustomer(dto);
        return res;
    }
    
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        boolean res = custmodel.deleteCustomer(id);
        return res;
    }
    
    public CustomerDto searchCust(String id) throws ClassNotFoundException, SQLException{
        CustomerDto dto = custmodel.searchCust(id);
        return dto;
    }
}
