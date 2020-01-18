package JavaPrograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int num, sum=0, temp;
		System.out.println("Enter the number: ");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		temp = num;
		
		while(temp>0){
			sum=sum+temp%10;
			temp=temp/10;
		}
		System.out.println("Sum of digits of a number '" + num + "' is: " + sum);
	}

}
