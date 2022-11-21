// Given two strings as input, find number of occurrences of last character in second string, in the first string. Don't use string library functions for this program

// Input: “going to go to goa”, “go”
// Output: 5 (last char of str2 is o and it appeared 5 times in str1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = (sc.nextLine().trim()).split(",");
		char key = (s[1]).charAt(s[1].length()-2);
		int count = 0;
		for(int i = 1 ; i < s[0].length()-1 ; i++){
		    if(s[0].charAt(i) == key){
		        count++;
		    }
		}
		
		System.out.println(count);
		
	}
}
