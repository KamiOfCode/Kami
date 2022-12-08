/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;

import java.util.Scanner;

/**
 *
 * @author Kuuga
 */
public class Employee {
    private String code;
    private String name;
    private int phone;
    private String address;
    private String department;

    public Employee() {
    }

    public Employee(String code, String name, int phone, String address, String department) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + phone + "\t" + address + "\t" + department; 
    }
    
}
