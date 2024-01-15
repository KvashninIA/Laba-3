package Lr3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
// создаем главный метод:
    public static void main(String[] args) {
// создаем объект класса scanner
        Scanner in = new Scanner(System.in);
// выводим в консоль сообщение для пользователя
        System.out.println("Введите размер массива ");
// указали размер массива и считали его.
        int size = in.nextInt();
        // если размер массива больше 0 ,тогда логика задачи выполняется до значения else.
        if (size > 0) {
            // создаем объект класса рандом
            Random random = new Random();
            // создаем интовый массив и в нем указываем размер этого массива
            int[] ints = new int[size];

            for (int i = 0; i < ints.length; i++) {
                boolean iterator = true;
                // создаем переменную итератор, чтобы у нас отработал ложный цикл
                int x = 0;
                while (iterator) {
                    x = random.nextInt(100);
                    // если число делиться на 5 и остаток 2, тогда включаем итератор false.
                    if (x % 5 == 2) {
                        iterator = false;
                    }
                }
                // после внутреннего цикла выходим из него и все подходящие значения записываем в наш массив и так далее.
                ints[i] = x;
            }
            // выводим на консоль при помощи метода toString, класса Arrays все элементы этого массива.
            System.out.println(Arrays.toString(ints));
            // если размер = 0 или < 0, тогда значение введено не корректно.
        } else {
            System.out.println("Введено некорректное значение.");
        }
    }
}

