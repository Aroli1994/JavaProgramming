package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first,second;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number: ");
		first=scn.nextInt();
		System.out.println("Enter second number: ");
		second=scn.nextInt();
		
		System.out.println("Numbers before swapping are ");
		System.out.println("first="+first);
		System.out.println("second="+second);
		
		first=first+second;
		second=first-second;
		first=first-second;

		System.out.println("Numbers after swapping are ");
		System.out.println("first="+first);
		System.out.println("second="+second);
	}

}
