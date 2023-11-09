package main.java.com.site;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Введите исходную строку: ");
        Scanner Vvod = new Scanner(System.in);
        String strely = Vvod.nextLine();

        if (strely.length()>106)
        {
            System.out.println("Длина строки превышает условие");
        }
        else
        {
        int k =0;
        int number = strely.indexOf(">>->");

        while (number != -1)
        {

            strely = strely.replaceFirst(">>->","");
            k++;
            number = strely.indexOf(">>->");

        }

        number = strely.indexOf("<-<<");

        while (number != -1)
        {

            strely = strely.replaceFirst("<-<<","");
            k++;
            number = strely.indexOf("<-<<");

        }

        System.out.println("Количество стрел: " + k);
        }
    }
}
