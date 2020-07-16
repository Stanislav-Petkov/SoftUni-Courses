package com.company;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number  ");
        double a = scanner.nextDouble();
        double area = a * a;
        System.out.print("Square area ");
        System.out.print(area);
    }
}
