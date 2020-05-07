package io.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.printHelloName();
    }
    
    public void printHelloName() {
        String name = getUserName();
        printHello(name);
    }
    
    public String getUserName() {
        System.out.print("Comment vous appelez-vous ? ");
        try (Scanner sc = new Scanner(System.in)) {
            return sc.next();
        }
    }
    
    public void printHello(String name) {
        System.out.print("Bonjour " + name + " !");
    }
}
