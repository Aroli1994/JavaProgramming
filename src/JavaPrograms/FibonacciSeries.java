package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=0,sum=0;
		int first=0,second=1;
		System.out.println("Enter the number of values to be printed: ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		System.out.println("Fibonacci Series are: ");
		for(int i=0;i<num;i++){
			System.out.print(first+", ");
			sum=first+second;
			first=second;
			second=sum;
		}
	}

}
