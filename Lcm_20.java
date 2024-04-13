package com.web.java;

import java.util.Scanner;

public class Lcm_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("enter first positive number:");
        int n1 = scanner.nextInt(); 

        System.out.println("Enter second positive number:");
        int n2 = scanner.nextInt(); 

       
        int lcm = calLCM(n1, n2);

       
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);

        scanner.close();
    }

   
    public static int calLCM(int c, int d) {
        return (c * d) / calGCD(c, d);
    }

   
    public static int calGCD(int c, int d) {
        while (d!= 0) {
            int temp = d;
            d = c% d;
            c = temp;
        }
        return c;
    }
	}


