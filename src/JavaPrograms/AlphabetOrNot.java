package JavaPrograms;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		char c;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the character: ");
		c=scn.next().charAt(0);
		if((c>='a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println("'"+c+"' is alphabet");
		}
		else{
			System.out.println("'"+c+"' is not an alphabet");
		}
	}

}
