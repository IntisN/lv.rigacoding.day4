package lv.rigacoding.day4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author IntisN
 */
public class Loops {

    public static void countToN() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadiet skaitli N: ");
        int n = input.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            total = total + i;
            //total += i;
        }
        System.out.println("Kopā ir: " + total);
    }

    public static void countN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet skaitu N: ");
        int total = 0;
        int average = 0;
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ievadi " + i + ". skaitli.");
            int skaitlis = input.nextInt();
            total = total + skaitlis;
        }
        System.out.println("Kopsumma ir: " + total);
        System.out.println("Vidējā summa ir: " + total / n);
    }

    public static void matrixFromN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet rindu N: ");
        int n = input.nextInt();
        int rinda = 0;
        while (n > rinda) {

            for (int i = 1; i <= n; i++) {
                System.out.print("#");
            }
            System.out.println();
            rinda++;
        }
    }

    public static void treeFromN() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet rindu skaitu N: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void reverseN() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet skaitļu rindu: ");
        int n = input.nextInt();
        int last = n % 10;
        int left = n / 10;
        System.out.print(last);
        while (left>0){
            last = left % 10;
            System.out.print(last);
            left = left / 10;
        }
        System.out.println();
    }
}
