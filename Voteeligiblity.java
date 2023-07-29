package javaexample;

import java.util.Scanner;

public class Voteeligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}
		else
			System.out.println("Not eligible to vote");

	}

}
