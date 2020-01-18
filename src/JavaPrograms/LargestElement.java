package JavaPrograms;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {

		int[] arr={10,50,24,35,-100};
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(largest<arr[i]){
				largest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest element in array:" +largest);
	}

}
