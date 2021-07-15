package com.example.myapplication;



public class TestStack {
    int top;
    int capacity;
    int [] stack;

     TestStack() {
       top = -1;
       capacity = 10;
       stack = new int[capacity];
    }
    public boolean isEmpty(){
         return top == -1;
    }

    public boolean isfull(){
        return top == capacity -1;
    }
    public int push(int data ){
         if (isfull()){
             System.out.println("Full Stack ");
         }
         return stack[++top] = data;
    }
    public int pop(){
         if (isEmpty()){
             System.out.println("Empty Stack");
         }
         return stack[top --];
    }
    public int peek(){
         return stack[top];
    }

}
