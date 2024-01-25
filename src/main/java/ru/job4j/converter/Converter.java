package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(420);
        float dollar = rubleToDollar(420);
        float input = 420;
        float expectedEuro = 6;
        float expecteDollar = 7;
        float outputEuro = Converter.rubleToEuro(input);
        float outputDollar = Converter.rubleToDollar(input);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expecteDollar == outputDollar;
        System.out.println("420 rubles are " + euro + " euro. Test result : " + passedEuro);
        System.out.println("420 rubles are " + dollar + " dollar. Test result : " + passedDollar);
    }
}