package com.careeco.employeemanagement.serviceimpl;

import com.careeco.employeemanagement.model.Department;
import com.careeco.employeemanagement.model.Employee;

public class EmployeeManagementServiceImpl {

    Employee employee =new Employee();
    Department department =new Department();



    public void getDataOfEmployeee(String employeeId){


        if(employeeId.equalsIgnoreCase("101F")){
            employee.setEmployeeId("101F");
            employee.setEmployeeName("Sattibabu");
            employee.setSalary(2000000);

            department.setDepartmentId("101f");
            department.setDepartmentName("Technical");

            employee.setDepartment(department);
            System.out.println(employee);



        }




    }




}
