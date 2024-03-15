package entities;

import Exceptions.InvalidCustomerException;
import Exceptions.MaxSavingsAccountException;
import utils.TypeCustomer;

import java.util.ArrayList;

public class Customer {
    private static int autoIdCus;
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private TypeCustomer typeCustomer;
    private ArrayList<SavingAccount> savingAccounts;

    public Customer(String name, String address, String phoneNumber, TypeCustomer typeCustomer) throws InvalidCustomerException {
        if(name == null || name.isEmpty() || address == null || address.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()){
            throw new InvalidCustomerException("Invalid customer details");
        }
        this.id = ++autoIdCus;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.typeCustomer = typeCustomer;
        this.savingAccounts = new ArrayList<>();
    }

    public void addSavingsAccount(SavingAccount savingsAccount) throws MaxSavingsAccountException {
        if (savingAccounts.size() >= 5) {
            throw new MaxSavingsAccountException("Maximum limit of savings accounts reached");
        }
        savingAccounts.add(savingsAccount);
    }

    public String getId() {
        return String.format("%05d", autoIdCus++);
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TypeCustomer getCustomerType() {
        return typeCustomer;
    }

    public void setCustomerType(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public ArrayList<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public String getLastName() {
        String s = getName().trim();
        if (s.indexOf(" ") >= 0) {
            return s.substring(s.lastIndexOf(" ") + 1);
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", customerType=" + typeCustomer +
                //", savingAccounts=" + savingAccounts +
                '}';
    }
}
