package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringEachCharCount {
	static String s1,s2,s3;
	public static void main(String[] args) {
		s1="vinay";
		s2="Krishna";
		s3="Vinay Krishna";
		
		System.out.println("String '"+s1+"' : "+EachCharCount(s1));
		System.out.println("String '"+s2+"' : "+EachCharCount(s2));
		System.out.println("String '"+s3+"' : "+EachCharCount(s3));
	}

	public static Map<Character, Integer> EachCharCount(String str) {
		Map<Character, Integer> map=new HashMap<>();
		String tempStr=str.toLowerCase();
		char[] ch=tempStr.toCharArray();
		for(char c:ch){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		return map;
	}

}
