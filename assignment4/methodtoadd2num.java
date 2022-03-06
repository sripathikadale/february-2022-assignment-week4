package assignment4;

import java.util.Scanner;

public class methodtoadd2num {

	
		public static int add(int a,int b) {
			int sum=a+b;
			return sum;
		}
			public static void main(String[] args) {
				Scanner sc = new Scanner (System.in);
				System.out.println("enter  the first number: ");
				int n1 = sc.nextInt();	
				System.out.println("enter  the second number: ");
				int n2 = sc.nextInt();
				int sum = add(n1,n2);
				System.out.println("sum of two numbers :" +sum);
			// TODO Auto-generated method stub
		}
		}

		// TODO Auto-generated method stub

	


