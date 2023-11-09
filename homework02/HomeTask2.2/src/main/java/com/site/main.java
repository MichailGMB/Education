package main.java.com.site;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.print("Введите ПЕРВОЕ целое число: ");
        Scanner Vvod = new Scanner(System.in);
        int number1 = Vvod.nextInt();
        System.out.print("Введите ВТОРОЕ целое число: ");
        int number2 = Vvod.nextInt();
        System.out.println("Сумма двух чисел равна: " + (number1 + number2));
        System.out.println("Разность первого и второго чисел равна: " + (number1 - number2));
        System.out.println("Произведение двух чисел равна: " + (number1 * number2));
        float SrZnach = ((float) number1 + (float) number2) / 2;
        System.out.print("Среднее значение равно: ");
        System.out.printf("%.2f", SrZnach);
        System.out.println();
        System.out.println("Расстояние между числами: " + Math.abs(number1 - number2));
        if (number1 > number2) {
            System.out.println("Максимальное число: " + number1);
            System.out.println("Минимальное число число: " + number2);
        } else if (number1 < number2) {
            System.out.println("Максимальное число: " + number2);
            System.out.println("Минимальное число число: " + number1);
        } else System.out.println("Числа равны");

    }
}