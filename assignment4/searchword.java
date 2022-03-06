package assignment4;

import java.util.Scanner;

public class searchword {

	public static void main(String[] args) {
        String s1 ="Analog";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character to be found :: ");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
			{
				System.out.println("found");
				
			}
			
			else
			{
				System.out.println("not found");
			}
		}

		// TODO Auto-generated method stub

	}

}
