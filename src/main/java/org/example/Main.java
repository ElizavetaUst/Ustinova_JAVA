package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       System.out.println("Введиет элементы массива: " );
       for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.println("Вывод элементов кратных 3: ");
       for (int i = 0; i < size; i++) {
           if (arr[i] % 3 == 0) {
               System.out.print(arr[i]);
           }
        }
    }
}