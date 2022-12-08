/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;

/**
 *
 * @author Kuuga
 */
public class FullTime extends Employee {
    private int salary;
    private int absent;

    public FullTime() {
    }

    public FullTime(String code, String name, int phone, String address, String department, int salary, int absent) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }
    
    public int getTotalSalary() {
        return salary - (absent * 35);
    }

    @Override
    public String toString() {
        return super.getCode() + "\t" + super.getName() + "\t" + getTotalSalary();
    }
    
}
