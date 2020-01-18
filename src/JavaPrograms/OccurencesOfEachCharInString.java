package JavaPrograms;

import java.util.Scanner;

public class OccurencesOfEachCharInString
{
    static int countSum;
    
    public static void main(final String[] args) {
        String s2 = "";
        String replaceStr = "";
        int count = 0;
        int maxCount = 0;
        char maxChar = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s3 = sc.nextLine();
        System.out.println("Length of string:" + s3.length());
        System.out.println("Occurences of each character in string '" + s3 + "':");
        for (int i = 0; i < s3.length(); ++i) {
            final char ch = s3.charAt(i);
            if (s2.indexOf(ch) == -1) {
                replaceStr = s3.replace(Character.toString(ch), "");
                count = s3.length() - replaceStr.length();
                OccurencesOfEachCharInString.countSum += count;
                System.out.println("'" + ch + "'" + " repeats " + count + " times");
                s2 = String.valueOf(s2) + ch;
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = ch;
                }
            }
        }
        System.out.println("repeated times=" + OccurencesOfEachCharInString.countSum);
        System.out.println("Maximum occuring character:" + maxChar);
    }
}