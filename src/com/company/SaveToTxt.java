package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SaveToTxt {


    public void saveArrayToTxt(ArrayList<String> numberArrayList) {
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Wprowadz nazwe pliku i cisnij enter Enter:");
            String line = b.readLine();
            FileWriter f = new FileWriter("E:\\V semesrtr\\Algorytmy is truktury danych\\" + line + ".txt", true);
            for (String number : numberArrayList) {
                f.write(number, 0, number.length());
                f.write(System.lineSeparator());
            }
            f.close();
        } catch (IOException er) {
            System.out.print(er);
        }


    }


    public void saveToTxt(String line) {
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("WprowadŸ liniê tekstu zakoñczon¹ znakiem Enter:");
            String line2 = b.readLine();
            FileWriter f = new FileWriter("E:\\V semesrtr\\Algorytmy is truktury danych\\wynik.txt", true);
            f.write(line, 0, line.length());
            f.write(System.lineSeparator());
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
