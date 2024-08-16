package com.abmike.barbershop;

public class Customer {

    public static final String ORD_PEFIX="ORD";
    public static final String VIP_PEFIX="VIP";

    private int customerID;
    private String customerName;
    private CustomerType customerType;

    public enum CustomerType {
        ORD, VIP
    }

    public Customer(int customerID, String customerName, CustomerType customerType) {
        this.customerID = customerID;
        this.customerType= customerType;
        this.customerName = (customerType == CustomerType.VIP? VIP_PEFIX:ORD_PEFIX)+customerID;
    }

    public int getCustomerID() {
        return customerID;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }


    public String getCustomerName() {
        return customerName;
    }


@Override
    public String toString() {
        return customerName;
}

}
