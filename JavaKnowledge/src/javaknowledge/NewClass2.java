/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaknowledge;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class NewClass2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(
"Enter choice 1 or 2" ));
switch (num){
case 1:
System.out.println( "Message for choice 1" );
break;
case 2:
System.out.println( "Message for choice 2" );
break;
default:
System.out.println( "Unknown choice" );
}//end


    }
}
