package main.java.com.site;
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {

        Scanner inputINT = new Scanner(System.in);

        System.out.print("Введите количество телевизоров: ");
        int n = inputINT.nextInt();

        Television[] tvArray = new Television[n];

        TvArrays spisok = new TvArrays(tvArray, n);

        spisok.vvod();
        spisok.sortingForYears();
        System.out.print("Отсортированный по годам список: ");
        spisok.output();
        System.out.println(spisok);//хеш код


    }
}