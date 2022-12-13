package DTO;

public class FullTime extends Employee{
    private int salary;
    private int absent = 0;

    public FullTime() {
    }

    public FullTime(int salary, int absent) {
        this.salary = salary;
        this.absent = absent;
    }

    public FullTime(int salary, int absent, String code, String name, String phone, String address, String department) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }

   
    public int totalSalary() {
        return salary - (absent * 35);
    }
    
    @Override
    public void printinfo() {
        System.out.println(code + " - " + name + " - " + totalSalary());
    }
}
