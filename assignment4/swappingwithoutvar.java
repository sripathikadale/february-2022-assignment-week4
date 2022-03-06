package assignment4;
import java.util.Scanner;
public class swappingwithoutvar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		// TODO Auto-generated method stub

	}

}
