package assignment4;
import java.util.Scanner;
public class evennuminarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		//int n=arr.length;
		
	for(int i=0;i<10;i++)
	{
		System.out.println("enter the num ::");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(arr[i]);
		}
		
		
		}
		

	}

}
