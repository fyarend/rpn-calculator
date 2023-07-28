package com.spesce.rpn;

import java.util.Arrays;

public class Stack {
    private com.spesce.rpn.Node top;
    private int boyut;

    public Stack() {
        boyut = 0;
    }

    public Stack(double[] dataArray){
        Arrays.stream(dataArray).forEach(data -> push(data));
        boyut = dataArray.length;
    }

    public int getSize(){
        return boyut;
    }

    public boolean isEmpty(){
        return boyut == 0;
    }

    public void push(double data){
        if(top == null)
            top = new com.spesce.rpn.Node(data);
        else
        {
            com.spesce.rpn.Node current = new com.spesce.rpn.Node(data,top);
            top = current;
        }
        boyut++;
    }

    public double peekTop() {
        return top.getData();
    }

    public double pop() {
        final double data = top.getData();
        top = top.getNext();
        boyut--;
        return data;
    }

    public void print() {
        if(top == null)
            System.out.println("Bu alan boş");

        com.spesce.rpn.Node current = top;
        System.out.println(current.getData() + " <--");
        current = current.getNext();

        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
