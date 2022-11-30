package com.yu.TestLab;

import java.util.Scanner;
/**
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter data for 被除数 (输入 q 停止):");
        while (sc.hasNextInt()) {

            int a = sc.nextInt();
            System.out.println("Please enter data for 除数:");
            int b = sc.nextInt();
            int ret = a % b;

            System.out.println(a + "除以" + b + "等于" + a / b + "                余数为 " + ret);
            System.out.println("-----------------------------------------");
            System.out.println("Please enter data for 被除数 (输入 q 停止):");
        }
        sc.close();
        System.out.println("Game over！");
    }
}