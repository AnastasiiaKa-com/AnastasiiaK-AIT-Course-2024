package Classwork_26.ait.employee.dao;

import Classwork_26.ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);
    Employee findEmployee( int id);
    Employee updateEmployee(int id,Employee employee);
    int quantity();
    void  printEmployee();
    double totalSalary();
    double totalSales();
    Employee[] findEmployeeHoursGreaterThan(int hours);

   Employee[] findEmployeeSalaryRange(double min,double max);



}
