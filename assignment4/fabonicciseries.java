package assignment4;
import java.util.*;
public class fabonicciseries {
static	int n1=0,n2=1,n3=0;
	
	
	public static void fabonicci(int a)
	{ 
		
		if(a>0)
		{
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
            fabonicci(a-1);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=10;
		System.out.println(n1+""+n2);
		fabonicci(a-2);
		
		// TODO Auto-generated method stub

	}

}
