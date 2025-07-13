import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел от пользователя
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        compareNumbers(a, b);

        // Математические операции
        performOperations(a, b);

        scanner.close();
    }

    // Метод для сравнения двух чисел
    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("Результат сравнения: a > b");
        } else if (a < b) {
            System.out.println("Результат сравнения: a < b");
        } else {
            System.out.println("Результат сравнения: a = b");
        }
    }

    // Метод для выполнения математических операций
    public static void performOperations(int a, int b) {
        System.out.println("\nРезультаты операций:");
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));


    }
}