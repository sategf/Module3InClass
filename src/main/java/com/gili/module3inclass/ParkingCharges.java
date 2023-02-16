package com.gili.module3inclass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlabs
 */
import java.util.Scanner;
public class ParkingCharges {
    
    public static double calculateCharges(double hours){
        double total = 0.0;
        if (hours < 4){
            total = 2.0;
        }
        else if (hours > 3) {
            total = .50 * hours;
            total += 2.00;
        }
        if (total > 10) {
            total = 10;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double runningTotal = 0.0;
        System.out.println("Enter Hours Parked For Each Customer, Type -1 To Finish");
        double hours = input.nextDouble();
        while (hours != -1) {
            runningTotal += calculateCharges(hours);
            System.out.printf("Total: $%.2f%n" , runningTotal );
            hours = input.nextDouble();
        }
        System.out.printf("The final total is: $%.2f" , (runningTotal));
    }
    
}

