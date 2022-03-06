package assignment4;

import java.util.Scanner;

public class countnum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[10];
	
		int counteven = 0;
		int countodd = 0;
		for(int i=0;i<10;i++) 
		{
			System.out.println("enter the number : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
		if((arr[i]%2)==1)
		{
			counteven++;
			
		}
		else
		{
			countodd++;
		}
		}
		
		System.out.println("number of even elements ::" +counteven);
		System.out.println("number of odd elements ::" +countodd);
	}
}

