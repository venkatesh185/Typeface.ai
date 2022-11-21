// An LCD (Liquid Crystal Display) can represent multiple digits between 0 to 9 
// If you turn the LCD upside-down, some of the numbers still remain valid numbers. For example, 16 becomes 91, 10 becomes 01, which are valid numbers.
// If you index all positive numbers (>0) that can produce valid numbers when you upside down the display (like 1st one is 1, 2nd one is 2, 3rd one 5... 7th one is 10), 
// Write program to print the ’Nth’ number in the series

// Input: 8
// Output: 11


// 0125689
import java.util.*;
public class Main
{
    private static boolean isValid(String num){
        String s = "0125689";
        for(char c : num.toCharArray()){
            if(!s.contains(Character.toString(c)))
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0,ans = 0,i=0;
		while(count <= n){
		    if(isValid(Integer.toString(i))){
		        ans = i;
		        count++;
		    }
		    i++;
		}
		System.out.println(ans);
	}
}