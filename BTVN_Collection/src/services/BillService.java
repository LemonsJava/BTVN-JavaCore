package services;

import entities.Bill;
import entities.Customer;
import entities.Service;

import java.util.*;

public class BillService {

    public Bill createBill(Scanner scanner, List<Customer> customers, List<Service> services) {
        List<Service> listService = new ArrayList<>();
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.findCustomerById(scanner, customers);
        System.out.println("Nhap so luong dich vu: ");
        int count;
        while (true) {
            while (true) {
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap lai so luong dich vu !! ");
                }
            }
            if (count > 0 && count < 6 ) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Moi nhap thong tin dich vu thu " + (i+1) + " :");
                    while (true) {
                        Service service = findServiceById(scanner, services);
                        if (!checkService(service,listService)) {
                            listService.add(service);
                            break;
                        }
                    }
                }
                break;
            }
            else {
                System.out.println("Chi duoc phep su dung toi da 5 dich vu! ");
            }
        }
        System.out.println(new Bill(customer, listService));
        return new Bill(customer, listService);
    }

    public Service createService(Scanner scanner) {
        System.out.println("Moi nhap ten dich vu: ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap gia cuoc: ");
        double price;
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                if(price > 0.0) break;
                System.out.println("So tien phai > 0");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai so tien!");
            }
        }
        System.out.println("Moi nhap don vi: ");
        String unit = scanner.nextLine();
        return new Service(name, price, unit);
    }

    public void createListService(Scanner scanner, List<Service> services) {
        System.out.println("Moi nhap so luong dich vu: ");
        int count;
        while (true) {
            try {
                count = Integer.parseInt(scanner.nextLine());
                if(count > 0) break;
                System.out.println("So luong dich vu > 0!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai so luong dich vu !! ");
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Moi nhap thong tin dich vu thu " + (i+1) + " :");
            Service service = createService(scanner);
            services.add(service);
        }
    }

    public void showListService(List<Service> services) {
        if (!services.isEmpty()) {
            for (Service service : services) {
                System.out.println(service);
            }
        }
        else {
            System.out.println("Danh sach dich vu rong !");
        }
    }

    public Service findServiceById(Scanner scanner, List<Service> services) {
        if(!services.isEmpty()) {
            System.out.println("Moi nhap ID cua dich vu: ");
            int id;
            while (true) {
                while (true) {
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                        if(id > 0) break;
                        System.out.println("So luong dich vu > 0!");
                    } catch (NumberFormatException e) {
                        System.out.println("Vui long nhap lai so luong dich vu !! ");
                    }
                }
                for(Service service : services) {
                    if(service.getId().equals(String.format("%03d", id))) {
                        return service;
                    }
                }
                System.out.println("Khong tim thay dich vu! Vui long nhap lai ID: ");
            }
        }
        else {
            System.out.println("Danh sach dich vu rong!");
            return null;
        }
    }

    public boolean checkService (Service service, List<Service> services) {
        for(Service service1 : services) {
            if(service1.getId().equals(service.getId())) {
                System.out.println("Dich vu nay da duoc them vao hoa don roi! Nhap dich vu khac di!");
                return true;
            }
        }
        return false;
    }

    public void sortByLastname(List<Bill> bills) {
        bills.sort(Comparator.comparing(bill -> bill.getCustomer().getLastname()));
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    public void sortByNumsService(List<Bill> bills) {
        bills.sort((bill1, bill2) -> bill2.getServices().size() - bill1.getServices().size());
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    public void calMoney(Scanner scanner, List<Bill> bills) {
        if(!bills.isEmpty()) {
            System.out.println("Nhap ID cua khach hang: ");
            double sum = 0;
            int id;
            while (true) {
                try {
                    id = Integer.parseInt(scanner.nextLine());
                    if (id > 0) break;
                    System.out.println("ID la mot so nguyen duong!");
                } catch (NumberFormatException e) {
                    System.out.println("Moi nhap lai ID !!!");
                }
            }
            for (Bill bill : bills) {
                if (bill.getCustomer().getId().equals(String.format("%05d", id))) {
                    for (Service service : bill.getServices()) {
                        System.out.println("KH da dung dich vu " + service.getName() + " co gia: " + service.getPrice());
                        sum += service.getPrice();
                    }
                }
            }
            if (sum > 0) {
                System.out.println("Tong so tien khach hang phai tra la: " + sum);
            }
            else System.out.println("Khong tim hoa don KH co ID la " + id);


        }
        else System.out.println("Danh sach hoa don rong !!!");
    }

}
