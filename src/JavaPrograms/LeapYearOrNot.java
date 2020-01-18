package JavaPrograms;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year: ");
		Scanner scn=new Scanner(System.in);
		year=scn.nextInt();
		
		if((year%4==0) && (year%100!=0)){
			System.out.println(year+" is leap year");
		}
		else if((year%100==0) && (year%400==0)){
			System.out.println(year+" is leap year");
		}
		else if(year%400==0){
			System.out.println(year+" is leap year");
		}
		else{
			System.out.println(year+" is NOT a leap year");
		}
	}

}
