package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueOrNot {

	public static void main(String[] args) {
		String s1="vinay";
		String s2="Krishna";
		String s3="VinayKrishna";
		
		System.out.println("String '"+s1+"' is unique: "+isUnique(s1));
		System.out.println("String '"+s2+"' is unique: "+isUnique(s2));
		System.out.println("String '"+s3+"' is unique: "+isUnique(s3));
	}

	private static boolean isUnique(String str) {
		Set<Character> set=new HashSet<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(!set.add(ch[i])){
				return false;
			}
		}
		return true;
	}

}
