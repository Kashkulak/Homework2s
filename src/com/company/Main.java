package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int chislo = generateRandomAge();
        String i = qwe(chislo, 8);
        System.out.println(i);
    }

    public static int generateRandomAge() {
        Random r = new Random();
        int chislo = r.nextInt(85) + 1;
        return chislo;
    }

    public static String qwe(int age, int temperature) {
        if (age >= 20 & age <= 45 & temperature >= -20 & temperature <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 & temperature >= 0 & temperature <= 28) {
            return "Можно идти гулять";
        } else if (age < 45 & temperature >= -10 & temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
