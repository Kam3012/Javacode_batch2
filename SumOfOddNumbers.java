package javaexample;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++) {
				
			if(i%2 ==0) {
				continue;	
		        
			}
			sum = sum +i;	
		
			
		}
		System.out.println("Sum of even num from 1 to " +range+ " is: " +sum);

	}


	}


