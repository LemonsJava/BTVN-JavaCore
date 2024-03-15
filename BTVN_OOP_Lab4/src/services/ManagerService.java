package services;

import entities.Manager;

public class ManagerService extends EmployeeService{

    @Override
    public double calSalary(double salary) {
        return salary;  //lương trách nhiem duoc them 1 trieu
    }
    public double netPay(double salary) {
        if(salary <= 11000000)
            return salary;
        else
            return salary-(salary*0.1);
    }
}
