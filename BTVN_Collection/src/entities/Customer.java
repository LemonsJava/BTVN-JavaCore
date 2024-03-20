package entities;

import utils.CustomerType;

public class Customer {
    private static int autoId = 1;
    private final String id;
    private String name;
    private String address;
    private String phone;
    private CustomerType customerType;

    public Customer(String name, String address, String phone, CustomerType customerType) {
        this.id = String.format("%05d", autoId++);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.customerType = customerType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getLastname() {
        String name = getName().trim();
        if (name.indexOf(" ") >= 0) {
            return name.substring(name.lastIndexOf(" ") + 1);
        }
        else {
            return name;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", customerType=" + customerType.value +
                '}';
    }
}
