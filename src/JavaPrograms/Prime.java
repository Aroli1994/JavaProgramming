package JavaPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number: ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		
		if(isPrime(num)){
			System.out.println(num+" is Prime number");
		}
		else{
			System.out.println(num+" is not Prime number");
		}
	}

	public static boolean isPrime(int num) {
		if(num<2)
			return false;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				return false;
		}
		
		return true;
	}

}
