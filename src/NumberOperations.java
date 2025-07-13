import java.util.Scanner;
/*
1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль
 */
public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Пользователь вводит 2 числа
        System.out.print("Введите первое число a ");
        int a = sc.nextInt();

        System.out.print("Введите второе число b ");
        int b = sc.nextInt();

        compareNumbers(a, b);

        performOperations(a, b);

        sc.close();
    }
// Сравниваем числа и выводим результаты
    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("Результат сравнения a > b");
        } else if (a < b) {
            System.out.println("Результат сравнения a < b");
        } else {
            System.out.println("Результат сравнения a = b");
        }
    }
// Проводим математические операции и выводим результат
    public static void performOperations(int a, int b) {
        System.out.println("\nРезультаты операций:");
        System.out.println("Сложение " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение " + a + " * " + b + " = " + (a * b));
    }
}