package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}