
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class DemoUsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        I_Student st = (I_Student) new ManageStudent();
        
        List<Student> list = new ArrayList<>();
        
        String[] menu = {"Add new student", "Search a student", "Update name and mark", "Remove a student", "Print", "Quit"};
        
        int choice;
        do {
            choice = Menu.getChoice(menu);
            switch (choice) {
                case 1:
                    st.AddStudent((ArrayList<Student>) list);
                    break;
                case 2:
                    System.out.println("========Sarch Student========");
                    System.out.print("Input code: ");
                    String code = sc.nextLine();
                    st.SearchStudent((ArrayList<Student>) list, code);
                    break;
                case 3:
                    System.out.println("========Update new Student========");
                    String Ucode = sc.nextLine();
                    st.UpdateStudent((ArrayList<Student>) list, Ucode);
                    break;
                case 4:
                    System.out.println("========Remove Student========");
                    System.out.print("Enter code: ");
                    String Rcode = sc.nextLine();
                    st.RemoveStudent((ArrayList<Student>) list, Rcode);
                    break;
                case 5:
                    st.DisAllStudent((ArrayList<Student>) list);
                    break;
                case 6:
                    break;
            }
        } while (choice > 0 && choice < menu.length);
    }
}
