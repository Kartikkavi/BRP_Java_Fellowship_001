package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Stack;

public class StackAary1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(68);
        st.push(13);
        st.push(80);
        System.out.println(st);
        //Show the last element and remove the element
        System.out.println(st.pop());
        //Show the last element
        System.out.println(st.peek());
        //Show the refrence of an element
        System.out.println(st.search(10));
        //Print boolean result show the stack is empty or not
        System.out.println(st.empty());
    }
}
