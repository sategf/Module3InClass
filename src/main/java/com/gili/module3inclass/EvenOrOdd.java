package com.gili.module3inclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer10
 */
import java.util.Scanner;
public class EvenOrOdd {
    
    public static boolean isEven (int userInt){
        if (userInt % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers would you like to enter");
        int[] intArray = new int[input.nextInt()];
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Enter number " + (i+1) );
            intArray[i] = input.nextInt();
            String evenOrOdd = "";
            if (isEven(intArray[i]) == true){
                evenOrOdd = "even";
            }
            else{ 
                evenOrOdd = "odd";
            }
            System.out.println("This number is " + evenOrOdd );
        }
        
    }
}
