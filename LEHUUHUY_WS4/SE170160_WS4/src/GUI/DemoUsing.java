package GUI;


import DTO.ListEmployee;
import MyUtils.Utils;
import java.util.Scanner;

public class DemoUsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListEmployee objlist = new ListEmployee();
        
        int choice = 0;
        do {
            System.out.println("1- Create a list of Fulltime employee.");
            System.out.println("2- Create a list of Parttime employee.");
            System.out.println("3- Print a list of Fulltime employee.");
            System.out.println("4- Print a list of Parttime employee.");
            System.out.println("5- Exit.");
            choice = Utils.getInt("Enter choice: ", 0);
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        objlist.inputFullTinme();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 2; i++) {
                        objlist.inputPartTinme();
                    }
                    break;
                case 3:
                    objlist.printinfoFullTime();
                    break;
                case 4:
                    objlist.printinfoPartTime();
                    break;
                case 5:
                    System.out.println("Good bye!");
                    System.exit(0);
            }
        } while (choice <= 5);
    }
}
