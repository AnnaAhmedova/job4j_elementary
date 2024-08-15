package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
       return value / 98;
    }

    public static float rubleToDollar(float value) {
        return value / 89;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(392);
        float dollar = Converter.rubleToDollar(178);
        System.out.println("392 rubles are" + euro + " euro.");
        System.out.println("178 rubles are" + dollar + "dollar.");
        float input1 = 392;
        float expected1 = 4;
        float output1 = Converter.rubleToEuro(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("392 rubles are 4. Test result :" + passed1);
        float input2 = 178;
        float expected2 = 2;
        float output2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected2 == output2;
        System.out.println("178 rubles are 2. Test result :" + passed2);

    }
}
