/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Dto;

/**
 *
 * @author dinuka
 */
public class ItemDto {
    private String itemId;
    private String description;
    private String packSize;
    private double Price;
    private int qty;

    public ItemDto() {
    }

    public ItemDto(String itemId, String description, String packSize, double Price, int qty) {
        this.itemId = itemId;
        this.description = description;
        this.packSize = packSize;
        this.Price = Price;
        this.qty = qty;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemId=" + itemId + ", description=" + description + ", packSize=" + packSize + ", Price=" + Price + ", qty=" + qty + '}';
    }
}
