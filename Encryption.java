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
	// ----------------------------------------------------------
	public char encrypt(char in) {
        int charCode = (int) in;
        charCode += code;
        return (char)charCode;
    }
    // ----------------------------------------------------------
    public String encryptAll() {
        String output = "";
        char tmpChar;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                output += ' ';
                continue;
            }
            tmpChar = encrypt(message.charAt(i));
            output += tmpChar;
        }
        return output;
    }
	// ----------------------------------------------------------
	public static void main(String[] args) {
        Encryption encryptObj = new Encryption();
        encryptObj.getCode();
        encryptObj.getMessage();
        System.out.println();
        System.out.println("Final Encrypted message:");
        System.out.println(encryptObj.encryptAll());
    }
	// ----------------------------------------------------------
}
