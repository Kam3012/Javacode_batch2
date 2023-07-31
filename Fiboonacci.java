package javaexample;

public class Fiboonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		for(int i=1;i<=5;i++) {
			num3 = num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		
		}

	}

}
