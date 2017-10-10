package com.company;

public class MyThread extends Thread {

    String name;


    MyThread(String name){
        this.name=name;
    }

    public void run() {
        while (true) {
            System.out.println(" Hi, i am in progress" + name);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }

}


