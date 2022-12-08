/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;

import java.util.ArrayList;

/**
 *
 * @author Kuuga
 */
public interface I_Manage {
    public void AddFullTime(ArrayList<FullTime> list);
    public void AddPartTime(ArrayList<PartTime> list);
    public void DisFullTime(ArrayList<FullTime> list);
    public void DisPartTime(ArrayList<PartTime> list);
}
