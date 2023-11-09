package main.java.com.site;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Vvod = new Scanner(System.in);
        Scanner Vvod2 = new Scanner(System.in);
        System.out.print("Введите символ для повторения: ");
        char Text = Vvod.next().charAt(0);
        System.out.print("Введите количество повторений по вертикали: ");
        int K = Vvod2.nextInt();
        System.out.print("Введите количество повторений по горизонтали: ");
        int N = Vvod2.nextInt();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Text);
            }
            System.out.println();
        }
    }
}
