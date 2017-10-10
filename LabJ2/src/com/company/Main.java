package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            String  name  = scan.nextLine();
            Thread p = new MyThread(name);
            p.start();


        }
    }
}
