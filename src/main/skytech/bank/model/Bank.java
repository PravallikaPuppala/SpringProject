package skytech.bank.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.*;

public class Bank {

    private int customerId;
    @Size(min=2, max=30,message = "enter the name")
    private String customerName;

    private String accountType;

    private String PhoneNo;

    private  String address ;
    @Size(min=2, max=30)
    private  String fatherName;
    @NotEmpty @Email(message = "enter a valid email")
    private String email;
    private String aadhaarNo;

    private String password;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }


    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPassword() {
            return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }




    @Override
    public String toString() {
        return "Bank{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ",password='" + password + '\'' +
                ",role='" +role+'\''+
                '}';
    }
}
