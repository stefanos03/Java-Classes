/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaknowledge;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class NewClass {
    public static void main(String[] args) {
        //type 1
//        String strNum1, strNum2;
//    int num1, num2;
//
//    // create a Scanner input object
//    Scanner sc = new Scanner(System.in);
//
//    // ask the user to input an integer
//    System.out.println("Enter an integer value for num1: ");
//    // input the next integer input into num11
//    num1 = sc.nextInt();
//
//    // ask the user to input another integer
//    System.out.println("Enter another integer value for num2: ");
//    // input the next integer input into num22
//    num2 = sc.nextInt();
//
//    // display num11 and num22
//    System.out.println("num1 = " + num1 + " and num2 = " + num2 +
//                "\n num1 + num2 = " + (num1 + num2) );
//    
    //second way
   // String strNum13, strNum22;
    int num11, num22;

    // read a String from JOptionPane
   // strNum13 = JOptionPane.showInputDialog(
             // "Enter an integer value for num1: ");
    // read another String from JOptionPane
  //  strNum22 = JOptionPane.showInputDialog(
             // "Enter an integer value for num2: ");

    // convert the String variables to int variables
    num11 = Integer.parseInt( JOptionPane.showInputDialog(
              "Enter an integer value for num1: "));
    num22 = Integer.parseInt(JOptionPane.showInputDialog(
              "Enter an integer value for num2: "));

    // display num11 and num22
    JOptionPane.showMessageDialog(null,
                "num1 = " + num11 + " and num2 = " + num22 +
                "\n num1 + num2 = " + (num11 + num22) );
    }
}
