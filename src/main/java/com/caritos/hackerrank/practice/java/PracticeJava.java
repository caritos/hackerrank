package com.caritos.hackerrank.practice.java;

import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        System.out.println("hello world");
        JavaStdinAndStdoutI();
    }

    public static final void JavaStdinAndStdoutI() {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        scanner.close();

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);


    }
}
