package JavaPrograms;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		String s="Vinay Krishna";
		int len=s.length();
		int count=0;
		String s1="";
		for(int i=0;i<len;i++) {
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1) {
				count=len-s.replace(Character.toString(c), "").length();
				System.out.println(c+"-"+count);
				s1+=c;
			}
		}
	}

}
