package assignment4;

import java.util.Scanner;

public class sumofelementsinarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num= new int[10];
		int sum=0;
		
		for(int i=0;i<10;i++)
		{
			System.out.println("enter number : ");
			num[i]=sc.nextInt();
		  sum=sum+num[i];  
			
			
		}
		System.out.println("sumof all elements in array :: "+sum);
		
		

	}

}

	


