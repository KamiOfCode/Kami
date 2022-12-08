
package workshop4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kuuga
 */
public class EmployeeManagement {
    public static void main(String[] args) {
    I_Manage i = (I_Manage) new Manage();
    List<FullTime> list1 = new ArrayList<>();
    List<PartTime> list2 = new ArrayList<>();
    String[] menu = {"Add a new FullTime employee", "Add a new PartTime employee", "Print all FullTime employee", "Print all PartTime employee", "Quit"};
    int choice;
        do {            
            choice = Menu.getChoice(menu);
            switch(choice) {
                case 1:
                    i.AddFullTime((ArrayList<FullTime>) list1);
                    break;
                case 2:
                    i.AddPartTime((ArrayList<PartTime>) list2);
                    break;
                case 3:
                    i.DisFullTime((ArrayList<FullTime>) list1);
                    break;
                case 4: 
                    i.DisPartTime((ArrayList<PartTime>) list2);
                    break;
                case 5:
                    break;
            }
        } while (choice>0 && choice<menu.length);
    }
}
