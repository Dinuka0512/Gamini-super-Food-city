/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Dto;

/**
 *
 * @author dinuka
 */
public class OrderDto {
    private String OrderID;
    private String ItemCode;
    private int OrderQTY;
    private int Discount;

    public OrderDto() {
    }

    public OrderDto(String OrderID, String ItemCode, int OrderQTY, int Discount) {
        this.OrderID = OrderID;
        this.ItemCode = ItemCode;
        this.OrderQTY = OrderQTY;
        this.Discount = Discount;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public int getOrderQTY() {
        return OrderQTY;
    }

    public void setOrderQTY(int OrderQTY) {
        this.OrderQTY = OrderQTY;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "OrderID=" + OrderID + ", ItemCode=" + ItemCode + ", OrderQTY=" + OrderQTY + ", Discount=" + Discount + '}';
    }
}
