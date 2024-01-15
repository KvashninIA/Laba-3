package Lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];
        char letter = 'a';

        for (int i = 0; i < size; i++) {
            charArray[i] = letter;
            letter += 2; // Через одну букву
        }

        System.out.print("Массив в прямом порядке: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nМассив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}