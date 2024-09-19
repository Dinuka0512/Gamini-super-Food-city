/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Dto;
import java.util.ArrayList;
/**
 *
 * @author dinuka
 */
public class OrderDto {
    private String orderId;
    private String date;
    private String custId;

    private ArrayList<OrderDetailDto> orderDetailDto;

    public OrderDto() {
    }

    public OrderDto(String orderId, String date, String custId, ArrayList<OrderDetailDto> orderDetailDto) {
        this.orderId = orderId;
        this.date = date;
        this.custId = custId;
        this.orderDetailDto = orderDetailDto;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public ArrayList<OrderDetailDto> getOrderDetailDto() {
        return orderDetailDto;
    }

    public void setOrderDetailDto(ArrayList<OrderDetailDto> orderDetailDto) {
        this.orderDetailDto = orderDetailDto;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", date=" + date + ", custId=" + custId + ", orderDetailDto=" + orderDetailDto + '}';
    }
}
