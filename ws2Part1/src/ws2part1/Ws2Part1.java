/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2part1;

import java.util.Scanner;

/**
 *
 * @author lehuu
 */
public class Ws2Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont = false;
        
        do {
            try {
                int n;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                if (n < 1)
                        throw new Exception();
                System.out.println("The number is " + n);
                cont = false;
            }catch (Exception e){
                System.out.println("The number is invalid");
                cont = true;
            }
        }while (cont);
    }
    
}
