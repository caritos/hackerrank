package com.caritos.hackerrank.practice.java;

import java.util.Scanner;

public class Solution {
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

    public static final void JavaIfElse() {
        Scanner scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int x = scanner.nextInt();
        scanner.close();

        if(x % 2 != 0) {
            System.out.println("Weird");
        } else {
            if((2 <= x) && (x <= 5)) {
                System.out.println("Not Weird");
            } else if((6 <= x) && (x <= 20)) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

    public static final void javaStdinAndStdoutII() {

    }
}
