package JavaPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num, rev=0, temp;
		System.out.println("Enter the number: ");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		temp = num;
		
		while(temp>0){
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		System.out.println("Reverse of number is: "+rev);
		if(rev==num){
			System.out.println(num+" is palindrome");
		}
		else{
			System.out.println(num+" is not a palindrome");
		}
	}

}
