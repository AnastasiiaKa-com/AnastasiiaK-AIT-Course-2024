package Classwork_26.ait.employee.test;

import Classwork_26.ait.employee.dao.Company;
import Classwork_26.ait.employee.dao.CompanyImpl;
import Classwork_26.ait.employee.model.Employee;
import Classwork_26.ait.employee.model.Manager;
import Classwork_26.ait.employee.model.SalesManager;
import Classwork_26.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

   Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {

        company = new CompanyImpl(5);
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);

    }

    @Test
    void addEmployee() {


    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void findEmployeeHoursGreaterThan() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }

 @Test
 void testAddEmployee() {
 }

 @Test
 void testRemoveEmployee() {
 }

 @Test
 void testFindEmployee() {
 }

 @Test
 void testUpdateEmployee() {
 }

 @Test
 void testQuantity() {
 }

 @Test
 void testPrintEmployee() {
 }

 @Test
 void testTotalSalary() {
 }

 @Test
 void testTotalSales() {
 }

 @Test
 void testFindEmployeeHoursGreaterThan() {
 }

 @Test
 void testFindEmployeeSalaryRange() {
 }
}