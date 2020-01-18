package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,temp,sum=0,rem=0;
		System.out.println("Enter the number: ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		temp=num;
		
		while(temp>0){
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		System.out.println("Sum of cubes of digits of number '"+num+"' is: "+sum);
		if(sum==num){
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}
	}

}
