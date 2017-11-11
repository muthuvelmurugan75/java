package com.tricky.www;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass {
	public static void main(String[] args) {
	
	 try {
         System.out.println("Outer try block starts");
         try {
             System.out.println("Inner try block starts");
             int res = 0/0 ;
         } catch (InputMismatchException e) {
             System.out.println("InputMismatchException caught");
         } finally {
             System.out.println("Inner final");
         }
     } catch (ArithmeticException e) {
         System.out.println("Arithmetic caught");
     } finally {
         System.out.println("Outer finally");
     }

}}