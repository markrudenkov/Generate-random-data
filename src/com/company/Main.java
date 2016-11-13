package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        SaveToTxt write = new SaveToTxt();

        write.saveArrayToTxt(new dataGenerator().generateArrayOfNumbers(10000, 12));

    }
}
