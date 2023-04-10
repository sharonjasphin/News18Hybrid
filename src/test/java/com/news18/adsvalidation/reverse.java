package com.news18.adsvalidation;
import java.util.Scanner;
import org.testng.annotations.Test;

public class reverse{

	@Test	(priority = 0)
	public void reverseString() {
		String str= "Hello";
		for (int i = str.length()-1; i>=0; i--) {
			char rev = str.charAt(i);
			System.out.print(rev);
		}
	}
	
	public static String reverseWords(String str) {
		
		String[] words = str.split(" ");
		String result = "";
		
		for (int i = words.length-1; i >=0; i--) {
			if(i==0) {
				result=result+ words[i];
			}
			else {
				result=result+ words[i] +" ";
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "Welcome to India";
		System.out.print(reverseWords(str));
	}
	
	@Test(priority = 1)
	public void reversenum() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev=0;
		
		while(num!=0) {
			rev =rev*10 +num%10;
			num=num/10;
		}
		
		System.out.println(rev);
	}
}
