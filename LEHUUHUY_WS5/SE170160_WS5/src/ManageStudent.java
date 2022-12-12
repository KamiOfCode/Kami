
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import sun.applet.AppletViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class ManageStudent implements I_Student{
    double mark;
    String code, name;
    
    @Override
    public void AddStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Student's information");
        boolean check = true;
        //enter code
        do {
            System.out.print("\tInput code: ");
            code = sc.nextLine();
            if (code.matches("^S\\d{3}$")) {
                System.out.println("\tCode is valid");
                check = false;
            } else {
                System.out.println("\tCode is invalid");
            }
        } while (check == true);
        
        //enter name
        do {
            System.out.print("\tInput name: ");
            name = sc.nextLine();
            try {
                if (name.length() <= 0) {
                    System.out.println("\tName is valid");
                    check = false;
                } else {
                    System.out.println("\tName is invald");
                }
            } catch (Exception ex) {
                System.out.println("\tName is not empty");
            }
        } while (check == true);
        
        //enter mark
        do {
            try {
                System.out.print("\tInput mark: ");
                mark = Double.parseDouble(sc.nextLine());
                check = false;
            } catch (Exception ex) {
                System.out.println("\tMark from 0 to 10");
            }
        } while (check == true || mark < 0 || mark > 10);
        
        Student s = new Student(code, name, mark);
        list.add(s);
        System.out.println("========Student has been added!========");
    }

    @Override
    public void SearchStudent(ArrayList<Student> list, String code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("Finded Studetn!");
    }

    @Override
    public void UpdateStudent(ArrayList<Student> list, String Ucode) {
        Scanner sc = new Scanner(System.in);
        for (Student student : list) {
            if (student.getCode().equals(Ucode)) {
                System.out.println("\tUpdate new name: ");
                String newName = sc.nextLine();
                student.setName(newName);
                System.out.println("\tUpdate new mark: ");
                double newMark = Double.parseDouble(sc.nextLine());
                student.setMark(newMark);
            }
        }
        
    }

    @Override
    public void RemoveStudent(ArrayList<Student> list, String Rcode) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(Rcode)) {
                list.remove(i);
            }
        }
        
        System.out.println("Student has been removed!");
    }

    @Override
    public void DisAllStudent(ArrayList<Student> list) {
        System.out.println("======ALL STUDENT OF LIST======");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
    }
    
}
