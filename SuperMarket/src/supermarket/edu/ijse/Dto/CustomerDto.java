/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.edu.ijse.Dto;

/**
 *
 * @author dinuka
 */
public class CustomerDto {
    private String CustID;
    private String CustTitle;
    private String CustName;
    private String DOB;
    private double salary;
    private String CustAddress;
    private String City;
    private String Province;
    private String PostalCode;

    public CustomerDto() {
    }

    public CustomerDto(String CustID, String CustTitle, String CustName, String DOB, double salary, String CustAddress, String City, String Province, String PostalCode) {
        this.CustID = CustID;
        this.CustTitle = CustTitle;
        this.CustName = CustName;
        this.DOB = DOB;
        this.salary = salary;
        this.CustAddress = CustAddress;
        this.City = City;
        this.Province = Province;
        this.PostalCode = PostalCode;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public String getCustTitle() {
        return CustTitle;
    }

    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "CustID=" + CustID + ", CustTitle=" + CustTitle + ", CustName=" + CustName + ", DOB=" + DOB + ", salary=" + salary + ", CustAddress=" + CustAddress + ", City=" + City + ", Province=" + Province + ", PostalCode=" + PostalCode + '}';
    }
}
