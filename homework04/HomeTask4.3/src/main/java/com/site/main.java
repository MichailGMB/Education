package main.java.com.site;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Введите исходную строку: ");
        Scanner Vvod = new Scanner(System.in);
        String str = Vvod.nextLine();

        str = str.toLowerCase();

        int number = str.indexOf(' ');
        String str1 = str.substring(0,number);
        String str2 = str.substring(number+1, str.length());

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        str1 = new String(ch1);


        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        str2 = new String(ch2);


        System.out.println(str1 + " " + str2);
    }
}
