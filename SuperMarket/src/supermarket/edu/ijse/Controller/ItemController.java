/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Controller;
import java.sql.SQLException;
import java.util.List;
import supermarket.edu.ijse.Model.ItemModel;
import supermarket.edu.ijse.Dto.ItemDto;
/**
 *
 * @author dinuka
 */
public class ItemController {
    private ItemModel itemModel = new ItemModel();
    
    public List<ItemDto> getAllItem() throws ClassNotFoundException, SQLException{
        List<ItemDto> dto = itemModel.getAllItem();
        return dto;
    }
    
    public boolean itemSave(ItemDto dto) throws SQLException, ClassNotFoundException{
        boolean res = itemModel.saveItem(dto);
        return res;
    }
    
    public ItemDto searchItem(String id) throws ClassNotFoundException, SQLException{
        ItemDto dto = itemModel.searchItem(id);
        return dto;
    }
    
    public boolean itemUpdate(ItemDto dto) throws ClassNotFoundException, SQLException{
        boolean res = itemModel.itemUpdate(dto);
        return res;
    }
    
    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException{
        boolean res = itemModel.deleteItem(id);
        return res;
    }
}
