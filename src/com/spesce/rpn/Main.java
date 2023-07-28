package com.spesce.rpn;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("-----RPN HESAPLAMA-----");
        String inp = "";
        Scanner inpScan = new Scanner(System.in);

        while (inp != "q") {
            System.out.println("Hesaplamak istediğiniz RPN ifadesini yazınız");
            inp = inpScan.nextLine();
            try {
                System.out.println(RPN.evaluate(inp));
            } catch (Exception e) {
                System.out.println("Geçersiz İfade, Tekrar deneyin veya çıkmak için 'q' yazın");
            }

        }

    }
}