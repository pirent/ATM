//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Keypad.java
//  @ Date : 7/18/2014
//  @ Author : 
//
//
package AtmGeneratedCode;

import java.util.Scanner;

/**
 * Represents the keypad of the ATM and is responsible for receiving all user
 * input. Recall that we’re simulating this hardware, so we use the computer’s
 * keyboard to approximate the keypad
 * 
 * @author nduy
 * 
 */
public class Keypad
{
    private Scanner input;
    
    public Keypad()
    {
        input = new Scanner(System.in);
    }
    
    public int getInput()
    {
        /*
         * Method can throw an InputMismatchException if the user enters
         * non-integer input. Because the real ATM’s keypad permits only integer
         * input, we assume that no exception will occur and do not attempt to
         * fix this problem.
         */
        return input.nextInt();
    }
}
