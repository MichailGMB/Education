package main.java.com.site;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String symbol2 = "qwertyuiopasdfghjklzxcvbnm";
        System.out.print("Введите символ: ");
        Scanner Vvod = new Scanner(System.in);

        String symbolO = Vvod.nextLine();
        int number = symbol2.indexOf(symbolO);
        if (number==0)
        {
            System.out.println(symbol2.charAt(25));
        }
        else
        {
            System.out.println(symbol2.charAt(number-1));
        }
    }
}
