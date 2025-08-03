package com.Exception;

import java.util.Scanner;

class CustomException extends Exception 
{
 public CustomException(String message) {
     super(message);
 }

 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter your current balance: ");
     double balance = sc.nextDouble();

     System.out.print("Enter amount to withdraw: ");
     double withdrawAmount = sc.nextDouble();

     try {
         if (withdrawAmount > balance) {
             throw new CustomException("Insufficient balance! Withdrawal denied.");
         } else {
             balance -= withdrawAmount;
             System.out.println("Withdrawal successful!");
             System.out.println("Remaining balance:" + balance);
         }

     } catch (CustomException e) {
         System.out.println("Exception has occurred: " + e.getMessage());
     }

     sc.close();
 }
}