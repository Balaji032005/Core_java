package ashokk;

import java.util.Scanner;

public class theatre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome to ticket booking system");
        System.out.println("enter your age");
        int age=scan.nextInt();
        int ticketprice;
        if (age<5) {
            System.out.println("ticket is free for age under 5");
            ticketprice = 0;
        }
        else
            System.out.println("your ticket price is 300");
        System.out.println("select your seat");
    }
}

