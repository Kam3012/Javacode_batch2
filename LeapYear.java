package javaexample;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		if(((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0))) {
			System.out.println("The given year\t"  +year+ "\tis leap year");
		}
		else {
			System.out.println("The given year\t" +year+ "\tis not a leap year");
		}

	}

}
