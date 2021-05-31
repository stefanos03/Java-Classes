package javaknowledge;

import java.util.Stack;

public class stack1 {

    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> maxSt = new Stack<>();
     private Stack<Integer> minSt = new Stack<>();

    public void push(int data) {
        int max = data;
        int min=data;
        if (!maxSt.isEmpty() && max < maxSt.peek()) {
            max = maxSt.peek();
        } 
      if(!minSt.isEmpty() && max > minSt.peek()) {
            min = minSt.peek();
        } 
        
st.push(data);
maxSt.push(max);
minSt.push(min);
    }
    public void pop(){
        st.pop();
        maxSt.pop();
        minSt.pop();
    }
    public int getMax(){
        return maxSt.peek();
    }
    public int getMin(){
        return minSt.peek();
    }

    public static void main(String[] args) {
stack1 maxElem= new stack1();
maxElem.push(4);
maxElem.push(3);
maxElem.push(9);
maxElem.push(2);
maxElem.push(8);
        System.out.println(maxElem.st);
        System.out.println(maxElem.maxSt);
        System.out.println("Max Element  "+maxElem.getMax());
        System.out.println("Min Element  " +maxElem.getMin());


    }

}
