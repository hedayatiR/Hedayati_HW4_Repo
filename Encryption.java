package com.maktab;

import java.util.Scanner;

public class Encryption {
    private String message;
    private int code;
    // ----------------------------------------------------------
    public void getCode() {
        System.out.println("Enter number of code:");
        Scanner input = new Scanner(System.in);
        this.code = input.nextInt();
    }
    // ----------------------------------------------------------
    public void getMessage() {
        System.out.println("Enter the message to encrypt:");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        this.message = input.next();
    }
}
