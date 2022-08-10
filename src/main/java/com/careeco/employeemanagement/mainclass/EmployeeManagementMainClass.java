package com.careeco.employeemanagement.mainclass;

import com.careeco.employeemanagement.serviceimpl.EmployeeManagementServiceImpl;

public class EmployeeManagementMainClass {

    public static void main(String args[]){

        EmployeeManagementServiceImpl employeeManagementServiceImpl =new EmployeeManagementServiceImpl();
        employeeManagementServiceImpl.getDataOfEmployeee("101F");


    }

}
