package com.busel;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Rhombus romb = new Rhombus(4, 45, "yellow");
        romb.printInfo();
        Tetragon.whoIAm(romb);
        int perimeter = Tetragon.getPerimeter(romb);
        System.out.println(perimeter);
        romb.setColour("green");
        romb.printInfo();


        Scanner inScan = new Scanner(System.in);
        Words words = new Words(inScan);
        inScan.close();

        FileReader fileReader = new FileReader("./resources/io.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = "";

        ArrayList<String> lines = new ArrayList<>();
        for (; string != null; string = bufferedReader.readLine()){
            lines.add(string);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("./resources/io.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i = lines.size()-1; i >= 0 ; i--){
            bufferedWriter.write(lines.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
