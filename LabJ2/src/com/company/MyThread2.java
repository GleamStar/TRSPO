package com.company;
import java.util.Scanner;
public class MyThread2 implements Runnable {
    int a,b;
    Scanner scan = new Scanner(System.in);
    public void run () {
        while(true){
            System.out.println("First one");
            a = scan.nextInt();
            System.out.println("Second one");
            b = scan.nextInt();
            System.out.println("Sum = "+(a+b));
        }
    }
}
