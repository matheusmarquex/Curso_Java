package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height ");
        System.out.println("WIDTH: ");
        rect.width = sc.nextDouble();
        System.out.println("HEIGHT: ");
        rect.height = sc.nextDouble();

        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Diagonal: " + rect.diagonal());

        sc.close();
    }
}
