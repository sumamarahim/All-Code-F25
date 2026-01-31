package com.sumama.vault.security;

// the lock - this file contains all the code related to securing the entire project
/**
 * Simple logic:
 * 1. create a method encrypt(text, shift) which takes string and int (key). It should loop through the string 
 * and shift the ASCII value of each character.
 * 2. Create a matching method decrypt().
 * Test:
 * In a temp main method, print encrypt("password", 5). 
 * Make sure it looks like garbage text.
 * Then decrypt that garbage and ensure it returns "password".
 */

// 12/27/2025 @ 2224


/**
 * 
 * Python code
 * 
 * 
text = input("Enter the text: ")
key = int(input("Enter the key: "))

encrypted_text = encrypt(text, key)
print("Encrypted text:", encrypted_text)
 */



public class SecurityUtils {

    // lets creat a key - this should be private and constant
    final int key = 7;
    String result;
    // method to encrypt
    void encrypt(String plainText, int key) {
        /**
         * Input: String plainText
         * Output: String encrypted
         * Logic:
         *      Create a StringBuilder or empty String variable
         *      Loop through each character of plainText
         *      cast each character to int and add key in it then cast it back to char
         *      append new character to result and finally return scrambled string
         */

    }

    // method to decrypt
    void decrypt() {
        /**
         * Input: String cipherText
         * Output:String plainText
         * Logic:
         *      Iterate through each char from cipherText and do vice versa of above algo (encrypt)
         */
    }

// Testing the functions - I'll remove this from this file and shift to main package
    public static void main(String... args) {
        SecurityUtils t = new SecurityUtils();
        t.encrypt();
        System.out.println("Test");
    }
}