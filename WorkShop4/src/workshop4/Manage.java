/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kuuga
 */
public class Manage implements I_Manage {

    @Override
    public void AddFullTime(ArrayList<FullTime> list) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        String code;
        System.out.println("Input all information");
        do {            
        System.out.print("\tInput code: ");
        code = sc.nextLine();
        if(code.matches("^FS\\d{5}$")){
            System.out.println("\tCode is valid");
            c = false;
        } else {
            System.out.println("\tCode is invalid");
        }
        } while(c==true);
        System.out.print("\tInput name: ");
        String name = sc.nextLine();
        System.out.print("\tInput phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.print("\tInput address: ");
        String address = sc.nextLine();
        System.out.print("\tInput department: ");
        String department = sc.nextLine();
        int salary = 0;
        do {            
            try {
                System.out.print("\tInput salary: ");
                salary = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("invalid");
            }
        } while (c==true || salary<=1500);
        int absent = 0;
        do {            
            try {
                System.out.print("\tInput absent: ");
                absent = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("invalid");
            }
        } while (c==true || absent<0);
        FullTime f = new FullTime(code, name, phone, address, department, salary, absent);
        list.add(f);
        System.out.println("\tEmployee has been added!");
    }

    @Override
    public void AddPartTime(ArrayList<PartTime> list) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        String code;
        System.out.println("Input all information");
        do {
        System.out.print("\tInput code: ");
        code = sc.nextLine();
        if(code.matches("^FS\\d{5}$")){
            System.out.println("Code is valid");
            c = false;
        } else {
            System.out.println("Code is invalid");
        }
        } while(c==true);
        System.out.print("\tInput name: ");
        String name = sc.nextLine();
        System.out.print("\tInput phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.print("\tInput address: ");
        String address = sc.nextLine();
        System.out.print("\tInput department: ");
        String department = sc.nextLine();
        int wage = 0;
        do {            
            try {
                System.out.print("\tInput wage: ");
                wage = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("invalid");
            }
        } while (c==true || wage<10);
        int present = 0;
        do {            
            try {
                System.out.print("\tInput present: ");
                present = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("invalid");
            }
        } while (c==true || present<=0);
        PartTime p = new PartTime(code, name, phone, address, department, wage, present);
        list.add(p);
        System.out.println("Employee has been added!");
    }

    @Override
    public void DisFullTime(ArrayList<FullTime> list) {
        System.out.println("===All employee work Full-time===");
        for (FullTime fullTime : list) {
            System.out.println("\t" + fullTime);
        }
    }

    @Override
    public void DisPartTime(ArrayList<PartTime> list) {
        System.out.println("===All employee work Part-time===");
        for (PartTime partTime : list) {
            System.out.println("\t" + partTime);
        }
    }
    
}
