package Lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели с большой буквы");

       String day = in.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("Номер дня недели - 1");
                break;
            case "Вторник":
                System.out.println("Номер дня недели - 2");
                break;
            case "Среда":
                System.out.println("Номер дня недели - 3");
                break;
            case "Четверг":
                System.out.println("Номер дня недели - 4");
                break;
            case "Пятница":
                System.out.println("Номер дня недели - 5");
                break;
            case "Суббота":
                System.out.println("Номер дня недели - 6");
                break;
            case "Воскресение":
                System.out.println("Номер дня недели - 7");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
