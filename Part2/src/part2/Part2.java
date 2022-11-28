package part2;

import java.util.Scanner;

/**
 *
 * @author lehuu
 */
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2;
        String op;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number 1:");
        num1 = sc.nextFloat();
        
        System.out.println("Input the number 2:");
        num2 = sc.nextFloat();
        
        System.out.println("Input the operator:");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        
        if (op.equals("+")){
            System.out.printf("The result of %.2f %s %.2f = %.2f",num1,op,num2,(num1+num2));
        }
        
        if (op.equals("-")){
            System.out.printf("The result of %.2f %s %.2f = %.2f",num1,op,num2,(num1-num2));
        }
        
        if (op.equals("*")){
           System.out.printf("The result of %.2f %s %.2f = %.2f",num1,op,num2,(num1*num2));
        }
        
        if (op.equals("/")){
            System.out.printf("The result of %.2f %s %.2f = %.2f",num1,op,num2,(num1/num2));
        }
    }    
}