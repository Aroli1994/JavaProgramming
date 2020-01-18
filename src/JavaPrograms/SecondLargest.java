package JavaPrograms;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[]={101,25,35,-50,20,-100};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<arr.length;i++){
			if(largest<arr[i]){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(secondLargest<arr[i]){
				secondLargest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("First Largest element: "+largest);
		System.out.println("Second Largest element: "+secondLargest);
	}

}
