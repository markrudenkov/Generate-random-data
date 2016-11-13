package com.company;

import java.util.ArrayList;
import java.util.Random;


public class dataGenerator {

    public ArrayList<String> generateArrayOfNumbers(int size, int numberLength) {
        ArrayList<String> numberArrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numberArrayList.add(generateRandomBigNumber(numberLength));
        }
        return numberArrayList;
    }

    public String generateRandomBigNumber(int lenght) {
        String bigNumber = "1";
        int sumOfDigits = 0;

        for (int i = 0; i < lenght - 3; i++) {
            int randomDigit = generateRandomDigit();
            sumOfDigits += randomDigit;
            bigNumber += Integer.toString(randomDigit);
        }
        bigNumber += generateTwodigitkey(sumOfDigits);
        return bigNumber;
    }

    public int generateRandomDigit() {
        int randomDigit = new Random().nextInt(9);
        return randomDigit;
    }

    public String generateTwodigitkey(int sumOfdigits) {
        String key = "";
        if (sumOfdigits < 10) {
            key += "0" + Integer.toString(sumOfdigits);
        } else if (sumOfdigits > 99) {
            key += Integer.toString(sumOfdigits);
            key.substring(0, 1);
        } else {
            key += Integer.toString(sumOfdigits);
        }
        return key;
    }
}
