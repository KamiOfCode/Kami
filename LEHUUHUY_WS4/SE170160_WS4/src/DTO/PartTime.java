package DTO;

public class PartTime extends Employee{
    private int Daily_wage;
    private int present;

    public PartTime(int Daily_wage, int present) {
        this.Daily_wage = Daily_wage;
        this.present = present;
    }

    public PartTime(int Daily_wage, int present, String code, String name, String phone, String address, String department) {
        super(code, name, phone, address, department);
        this.Daily_wage = Daily_wage;
        this.present = present;
    }

    public int totalSalary() {
        return Daily_wage * present;
    }
    
    @Override
    public void printinfo() {
        System.out.println(code + " - " + name + " - " + totalSalary());
    }
}
