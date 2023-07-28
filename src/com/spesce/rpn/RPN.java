package com.spesce.rpn;

import java.util.*;
public class RPN {
    public static double evaluate(String expr) {
        if (expr.isEmpty()) return 0;

        int ilk = 0;

        Stack stack = new Stack();

        do
        {
            int space = expr.substring(ilk).indexOf(' ');
            int end = space == -1 ? expr.length() : ilk + space;
            String current = expr.substring(ilk,end);//geçerli numara veya operatör girilmeli
            if("+-*/".indexOf(current.charAt(0)) != -1)//girilen değerin operatör olup olmadığını kontrol eder
            {//stack.pop ile ilk öğeyi döndürür
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operate(current.charAt(0),b,a));
            }
            else
            {
                stack.push(Double.parseDouble(current));
            }
            ilk = end + 1;//boşluktan sonra baştan başla
        }while(ilk < expr.length());

        double sonuc = stack.pop();

        while(!stack.isEmpty())
        {
            double current = stack.pop();
            sonuc = current > sonuc ? current : sonuc;
        }

        return sonuc;
    }
    //a "opr" b döndür
    public static double operate(char operand,double a, double b){

        Hashtable<Character,Double> opHash = new Hashtable<Character,Double>();
        opHash.put('+',a + b);
        opHash.put('-',a - b);
        opHash.put('*',a * b);
        opHash.put('/',a / b);

        return opHash.get(operand);
    }

}
