package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (row == 0 && cell == 0 || row == 0 && cell == 2 || row == 1 && cell == 1
                        || row == 1 && cell == 3 || row == 2 && cell == 0 || row == 2 && cell == 2
                        || row == 3 && cell == 1 || row == 3 && cell == 3) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
