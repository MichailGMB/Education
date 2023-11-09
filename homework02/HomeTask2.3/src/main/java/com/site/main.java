package main.java.com.site;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Vvod = new Scanner(System.in);
        Scanner Vvod2 = new Scanner(System.in);
        System.out.print("Введите исходную строку для повторения: ");
        String Text = Vvod.nextLine();
        System.out.print("Введите количество повторений: ");
        int K = Vvod2.nextInt();
        for (int i = 0; i < K; i++) {
            System.out.print(Text);
        }
    }
}
