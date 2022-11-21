// Given an integer as input. Write a function to convert that to base 3 number

// Input: 10 
// Output: 101

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		while(n>0){
		    ans = Integer.toString(n%3)+ans;
		    n/=3;
		}
		System.out.println(ans);
	}
}
