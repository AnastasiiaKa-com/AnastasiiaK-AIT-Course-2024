package Classwork_27.dao;

//    - добавление сотрудника +
//    - нахождение сотрудника по id +
//    - обновление cотрудника +
//    - удаление сотрудника +
//    - печать списка сотрудников +
//    - кол-во сотрудников +
//    - объем ФОТ
//    - объем продаж


import Classwork_27.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    Employee updateEmployee(Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary();

    double averageSalary();

    double totalSales();

    Employee[] findEmployeeHoursGreaterThan(int hours);

    Employee[] findEmployeeSalaryRange(double min, double max);

}
