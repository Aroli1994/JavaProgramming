package JavaPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num,fact=1;
		System.out.println("Enter a number: ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		for(int i=num;i>0;i--){
			fact=fact*i;
		}
		System.out.println("Factorial of a number '"+num+"' is: "+fact);
		
	}

}
