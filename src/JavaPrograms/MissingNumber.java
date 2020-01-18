package JavaPrograms;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr=new int[]{4,2,1,7,5,6};
		int actualSum=0,expectedSum=0,size;
		size=arr.length+1;
		expectedSum=size*(size+1)/2;
		actualSum=missingNumber(arr,expectedSum);
		System.out.println("Missing number: "+(expectedSum-actualSum));
	}

	public static int missingNumber(int[] arr, int expectedSum) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}
