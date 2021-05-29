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
public class JavaKnowledge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        a = 107;
        b = 5;
        System.out.println("the value of:" + (a + b));
        System.out.println("the value of:" + (a - b));
        System.out.println("the value of:" + (a * b));
        System.out.println("the value of:" + (a % b));
        System.out.println("the value of:" + (a / b));

        //exercise 2
        int d = 25, w = 7;
        int quotient, rem;

        quotient = d / w;
        System.out.print(" day equals " + (d / w));
        rem = d % w;
        System.out.print(" weeks and " + (d % w) + " day ");

        //exercise 3
        String hours, Minutes, Second;
        int h, m, s;
        int totalsecond = 0;
        //input hours as a string
        hours = JOptionPane.showInputDialog(null, "How many Hours are there");
        //input minutes as a string
        Minutes = JOptionPane.showInputDialog(null, "How many min are there");
        //input seconds as a string///
        Second = JOptionPane.showInputDialog(null, "How many sec are there");
        //convert String to integers;
        h = Integer.parseInt(hours);
        m = Integer.parseInt(Minutes);
        s = Integer.parseInt(Second);
        totalsecond = h * 60 * 60 + m * 60 + s;

        //dispay answer
        JOptionPane.showMessageDialog(null, h + "hr" + m + "min" + s + "sec" + "\n" + "equals" + totalsecond + "seconds");

        // next
        double F, C = 23.9;
        F = (1.8 * C) + 32;
        System.out.println("F=" + F);

        // R
        double A, R;
        R = 12;
        A = Math.PI * R * R;
        System.out.println("A=" + A);

        // LAST
        int a1 = 50, b1 = 40;

        System.out.println("biggest integer is = " + Integer.MAX_VALUE + "\nsmallest integer is = " + Integer.MIN_VALUE);
        System.out.println("Biggest double is = " + Double.MAX_VALUE + "\nSmallest double is = " + Double.MIN_VALUE);
        System.out.println("biggest long is = " + Long.MAX_VALUE + "\nsmallest long is = " + Long.MIN_VALUE);

    }

}
