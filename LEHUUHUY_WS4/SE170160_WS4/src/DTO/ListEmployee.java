package DTO;

import java.util.ArrayList;
import java.util.List;
import MyUtils.Utils;

public class ListEmployee {
    
    List listemp = new ArrayList();
    
    public void inputFullTinme() {
        String name;
        String code;
        String phone;
        String address;
        String department;
        int salary;
        int absent;
        boolean check = true;
        
        do {
            code = Utils.getStringreg("Enter code: ", "^FS\\d{5}$", "Code is not null", "Code is wrong format!!!");
            if (checkCode(code) >= 0){
                System.out.println("Code is not applicate");
            } else {
                check = false;
            }
        } while (check);
        
        name = Utils.getString("Enter name: ", "Name is not null");
        phone = Utils.getStringreg("Enter phone: ", "0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12 digit!!!");
        address = Utils.getString("Enter address: ", "Address is not null");
        department = Utils.getString("Enter department: ", "Department is not null");
        salary = Utils.getInt("Enter salary: ", 1500);
        absent = Utils.getInt("Enter absent: ", 0);
        
        Employee emp = new FullTime(salary, absent, code, name, phone, address, department);
        listemp.add(emp);
        System.out.println("Add FullTime successfull");
    }
    
    public void inputPartTinme() {
        String code;
        String name;
        String phone;
        String address;
        String department;
        int Daily_wage;
        int present;
        
        boolean check = true;
        
        do {
            code = Utils.getStringreg("Enter code: ", "^FS\\d{5}$", "Code is not null", "Code is wrong format!!!");
            if (checkCode(code) >= 0){
                System.out.println("Code is not applicate");
            } else {
                check = false;
            }
        } while (check);
        
        name = Utils.getString("Enter name: ", "Name is not null");
        phone = Utils.getStringreg("Enter phone: ", "0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12 digit!!!");
        address = Utils.getString("Enter address: ", "Address is not null");
        department = Utils.getString("Enter department: ", "Department is not null");
        Daily_wage = Utils.getInt("Enter wage: ", 10);
        present = Utils.getInt("Enter present: ", 1);
        
        Employee emp = new PartTime(Daily_wage, present, code, name, phone, address, department);
        listemp.add(emp);
        System.out.println("Add PartTime successfull");
    }
    
    public void printinfoFullTime() {
        for (int i = 0; i < listemp.size(); i++) {
            if (listemp.get(i) instanceof FullTime) {
                ((FullTime) listemp.get(i)).printinfo();
            }
        }
    }
    
    public void printinfoPartTime() {
        for (int i = 0; i < listemp.size(); i++) {
            if (listemp.get(i) instanceof PartTime) {
                ((PartTime) listemp.get(i)).printinfo();
            }
        }
    }
    
    private int checkCode(String code) {
        for (int i = 0; i < listemp.size(); i++) {
                if (listemp.get(i) instanceof FullTime) {
                    if (((FullTime) listemp.get(i)).getCode().equalsIgnoreCase(code)) {
                        return i;
                    }
                }
                
                if (listemp.get(i) instanceof PartTime) {
                    if (((PartTime) listemp.get(i)).getCode().equalsIgnoreCase(code)) {
                        return i;
                    }
                }
        }
        return -1;
    }
}
