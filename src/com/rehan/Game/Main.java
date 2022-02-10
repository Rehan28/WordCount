package com.rehan.Game;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File file = new File("Rehan.txt");
        Scanner input = new Scanner(file);
        int word = 0;
        while (input.hasNextLine()){
            String line = input.nextLine();
            word += line.split(" ").length;
        }
        System.out.println("This file contain "+word+" word");
    }
}
