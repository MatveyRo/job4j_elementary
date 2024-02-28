package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int maxNumber = Max.max(70, 60);
        System.out.println(maxNumber);
        Max first = new Max();
        int maxNumberTree = first.max(70, 60, 90);
        System.out.println(maxNumberTree);
        Max second = new Max();
        int maxNumberFourth = second.max(30, 170, 20, 50);
        System.out.println(maxNumberFourth);
    }
}