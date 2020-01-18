package JavaPrograms;

import java.util.Map;
import java.util.Set;

public class MaximumOccuringCharInString {
	static String s1,s2,s3;
	public static void main(String[] args) {
		s1="vinay";
		s2="Krishna";
		s3="Vinay Krishna";
		
		System.out.println("String '"+s1+"' : "+StringEachCharCount.EachCharCount(s1));
		System.out.println("Maximum occuring character in string '"+s1+"' is "+"'"+maximumCharOccurences(s1)+"'");
		System.out.println("String '"+s2+"' : "+StringEachCharCount.EachCharCount(s2));
		System.out.println("Maximum occuring character in string '"+s2+"' is "+"'"+maximumCharOccurences(s1)+"'");
		System.out.println("String '"+s3+"' : "+StringEachCharCount.EachCharCount(s3));
		System.out.println("Maximum occuring character in string '"+s3+"' is "+"'"+maximumCharOccurences(s1)+"'");
	}

	public static char maximumCharOccurences(String str) {
		int maxCount=0;
		char maxChar = 0;
		
		Map<Character, Integer> map=StringEachCharCount.EachCharCount(s1);
		Set<Character> set=map.keySet();
		for(char c:set){
			if(map.get(c)>=maxCount){
				maxCount=map.get(c);
				maxChar=c;
			}
		}
		return maxChar;
	}

}
