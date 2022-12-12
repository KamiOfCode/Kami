
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public interface I_Student {
    public void AddStudent(ArrayList<Student> list);
    public void SearchStudent(ArrayList<Student> list, String code);
    public void UpdateStudent(ArrayList<Student> list, String Ucode);
    public void RemoveStudent(ArrayList<Student> list, String Rcode);
    public void DisAllStudent(ArrayList<Student> list);
}
