package main.java.com.site;

public class main {
    public static void main(String[] args) {
        int v = (int) (Math.random() * 10) / 4;
        System.out.println("Вася: " + v);
        int p = (int) (Math.random() * 10) / 4;
        System.out.println("Петя: " + p);
        if ((p == 0 && v == 1) || (p == 2 && v == 0) || (p == 1 && v == 2)) {
            System.out.println("Петя выиграл");
        } else if (p == v) {
            System.out.println("НИЧЬЯ");
        } else {
            System.out.println("Вася выиграл");
        }
    }
}
