1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”.

   Решение:
   
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

2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени".
   Решение:


 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3.

     Решение:
    
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

4. Дана скобочная последовательность: [((())()(())]]

Можно ли считать эту последовательность правильной?

Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

Решение: 

Последовательность является не правильной, так как не для каждой пары скобок есть своя открывающая и закрывающая скобка.
Правильный вариант последовательности [((())()(()))].
