package JavaPrograms;

public class CheckForDigitsInString {

	public static void main(String[] args) {

		String s1="1234";
		String s2="vinay1234";
		System.out.println("String '"+s1+"' contains only digits: "+OnlyDigits(s1));
		System.out.println("String '"+s2+"' contains only digits: "+OnlyDigits(s2));
	}

	private static boolean OnlyDigits(String s) {
		String regex = "[0-9]+";
		if(s.matches(regex) && s.length()>2){
			return true;
		}
		return false;
	}

}
