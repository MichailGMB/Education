package main.java.com.site;
import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Локализация для ввода через точку
        System.out.print("Введите температуру в градусах Фаренгейта: ");
        Scanner Vvod = new Scanner(System.in);
        float C = (float) Vvod.nextFloat();
        C = (C-32)*5/9;

        System.out.print("Температура в градусах Цельсия равна: ");
        System.out.printf("%.2f",C);

    }
}
