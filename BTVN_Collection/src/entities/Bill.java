package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private Customer customer;
    private List<Service> services;
    private LocalDateTime dateTime;

    public Bill(Customer customer, List<Service> services) {
        this.customer = customer;
        this.services = services;
        this.dateTime = LocalDateTime.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer.getName() +
                ", services=" + services +
                ", dateTime=" + dateTime.toLocalDate() +
                '}';
    }
}

