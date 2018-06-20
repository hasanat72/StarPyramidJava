/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.test;

import static java.time.Clock.system;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hasanat
 */
public class ProgrammingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the minimum number of stars? ");
        int min= input.nextInt();
        System.out.println("What is the maximum number of stars? ");
        int max= input.nextInt();
        System.out.println("What is the interval? ");
        int interval= input.nextInt();
        int row= ((max-min)/interval)+1;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<min;j++){
                System.out.print("*");
            }
            System.out.print("( "+min+ " stars"+")");
            min=min+interval;
            System.out.println(" ");
            
        }
        
        System.out.print("\n");
        
    }
    
}
