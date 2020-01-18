package JavaPrograms;

import java.util.Map;

public class FirstNonRepeatedCharInString {
	static String s1,s2,s3;
	public static void main(String[] args) {
		s1="vinay";
		s2="kriShna";
		s3="vInay Krishna";
		
		System.out.println("String '"+s1+"' : "+StringEachCharCount.EachCharCount(s1));
		System.out.println("First non-repeated character in string '"+s1+"' is "+"'"+FirstNonRepeatedCharacter(s1)+"'");
		System.out.println("First repeated character in string '"+s1+"' is "+"'"+FirstRepeatedCharacter(s1)+"'");
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("String '"+s2+"' : "+StringEachCharCount.EachCharCount(s2));
		System.out.println("First non-repeated character in string '"+s2+"' is "+"'"+FirstNonRepeatedCharacter(s2)+"'");
		System.out.println("First repeated character in string '"+s2+"' is "+"'"+FirstRepeatedCharacter(s2)+"'");
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("String '"+s3+"' : "+StringEachCharCount.EachCharCount(s3));
		System.out.println("First non-repeated character in string '"+s3+"' is "+"'"+FirstNonRepeatedCharacter(s3)+"'");
		System.out.println("First repeated character in string '"+s3+"' is "+"'"+FirstRepeatedCharacter(s3)+"'");
	}
	
	public static char FirstRepeatedCharacter(String str) {
		Map<Character, Integer> map=StringEachCharCount.EachCharCount(str);
		char[] charArray=str.toLowerCase().toCharArray();
		for(char c:charArray){
			if(map.get(c)>1){
				return c;
			}
		}
		return 0;
	}

	public static char FirstNonRepeatedCharacter(String str){
		Map<Character, Integer> map=StringEachCharCount.EachCharCount(str);
		char[] charArray=str.toLowerCase().toCharArray();
		for(char c:charArray){
			if(map.get(c)==1){
				return c;
			}
		}
		return 0;
	}
	

}
