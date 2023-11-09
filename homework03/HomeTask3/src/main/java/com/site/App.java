package main.java.com.site;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       /* int n;
        String brand;
        String model;
        int serial;
        int year;
        Scanner inputINT = new Scanner(System.in);
        Scanner inputSTR = new Scanner(System.in);
        System.out.print("Введите количество телевизоров: ");
        n = inputINT.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Введите бренд " + i + " телевизора: ");
            brand = inputSTR.nextLine();
            System.out.print("Введите модель " + i + " телевизора: ");
            model = inputSTR.nextLine();
            System.out.print("Введите серийный номер " + i + " телевизора: ");
            serial = inputINT.nextInt();
            System.out.print("Введите год выпуска " + i + " телевизора: ");
            year = inputINT.nextInt();
            Television tv1 = new Television(brand, model, serial, year);*/



        Television tv1 = new Television("Samsung", "SGH 3370", 417852369, 2015);
            System.out.println(tv1);
        }


    }

