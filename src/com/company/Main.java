package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her
        System.out.println("What is you name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(" Welcome, "+name);
    }
}
