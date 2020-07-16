package com.company;

import java.util.Scanner;

public class inchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number");
        Double inch = scanner.nextDouble();
        Double centimeter = inch * 2.54;
        System.out.print("Centimeter ");
        System.out.print(centimeter);
    }
}
