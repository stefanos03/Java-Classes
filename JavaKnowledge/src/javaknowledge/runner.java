/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaknowledge;

/**
 *
 * @author Dell
 */
public class runner {
    
    int stack[]=new int[5];
    int top=0;
    public void push(int data){
        stack[top]=data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");
        }
    }
}
