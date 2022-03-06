package assignment4;
import java.util.*;
public class calculator {
	public static int addcal(int a,int b)
	{
	int add = a+b;
	return add;
	}
	public static int subcal(int a,int b)
	{
	int sub = a-b;
	return sub;
	}
	public static int mulcal(int a,int b)
	{
	int mul = a*b;
	return mul;
	}
	public static int divcal(int a,int b)
	{
	int div = a/b;
	
	return div;
	}
	public static int avgcal(int a,int b)
	{
	int avg = a+b/2;
	return avg;
	}
	public static int modcal(int a,int b)
	{
	int mod = a%b;
	return mod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add = addcal(4,5);
		System.out.println(add);
		int sub = subcal(9,13);
		System.out.println(sub);
		int div = divcal(64,8);
		System.out.println(div);
		int mul = mulcal(12,19);
		System.out.println(mul);
		int avg = avgcal(12,89);
		System.out.println(avg);
		int mod = modcal(13,56);
		System.out.println(mod);
		
		
			
		
		

	}

}
