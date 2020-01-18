package JavaPrograms;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String s = "a1b2c3d4e";
		int sum = 0;
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				sum+=Integer.parseInt(Character.toString(ch));
			}
		}
		System.out.println("Sum="+sum);
	}

}
