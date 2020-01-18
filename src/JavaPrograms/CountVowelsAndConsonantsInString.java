package JavaPrograms;

public class CountVowelsAndConsonantsInString {

	public static void main(String[] args) {
		String s = "Java is easy";
		int vCount = 0, cCount = 0;
		String s1 = s.toLowerCase();
		System.out.println("Number of vowels and consonants present in string '"+s+"' are:");
		for (int i = 0; i < s1.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vCount++;
				break;
			default:
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
					cCount++;
				}
			}
		}
		System.out.println("Vowels: "+vCount);
		System.out.println("Consonants: "+cCount);
	}

}
