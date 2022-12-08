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
public class PartTime extends Employee {
    private int wage;
    private int present;

    public PartTime() {
    }

    public PartTime(String code, String name, int phone, String address, String department, int wage, int present) {
        super(code, name, phone, address, department);
        this.wage = wage;
        this.present = present;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
    
    public int getDailyWage() {
        return wage * present;
    }

    @Override
    public String toString() {
        return super.getCode() + "\t" + super.getName() + "\t" + getDailyWage();
    }
    
}
