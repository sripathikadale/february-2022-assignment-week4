package assignment4;
import java.util.*;
public class multiplyingfactor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the multiplying factor :");
		int d = sc.nextInt();
		int arr[] = {12,45,67,23,44,18};
		int n=arr.length;
		
	for(int i=0;i<n;i++)
	{
		arr[i] = arr[i]*d;
		
		System.out.println(arr[i]);
		
		}

		// TODO Auto-generated method stub

	}

}
