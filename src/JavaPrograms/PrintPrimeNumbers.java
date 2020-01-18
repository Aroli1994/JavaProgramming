package JavaPrograms;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		int lowerBound,upperBound,num;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower bound and upper bound values: ");
		lowerBound=scn.nextInt();
		upperBound=scn.nextInt();
		
		System.out.println("Prime numbers between "+lowerBound+" and "+upperBound+" are: ");
		for(int i=lowerBound;i<=upperBound;i++){
			num=i;
			if(Prime.isPrime(num)){
				System.out.print(num+" ,");
			}
		}
	}

}
