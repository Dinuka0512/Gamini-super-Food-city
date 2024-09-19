/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Dto;

/**
 *
 * @author dinuka
 */
public class OrderDetailDto {
    private String itemId;
    private int qty;
    private int discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemId, int qty, int discount) {
        this.itemId = itemId;
        this.qty = qty;
        this.discount = discount;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDro{" + "itemId=" + itemId + ", qty=" + qty + ", discount=" + discount + '}';
    }
}
