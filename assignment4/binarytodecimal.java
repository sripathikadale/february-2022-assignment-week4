package assignment4;

public class binarytodecimal {
	public static int decimal(int n)
	{
		int num=n;
		int decval =0;
		int base =1;
		int temp = num;
		while(temp>0)
		{
			int lastdig = temp%10;
			temp = temp/10;
			decval += lastdig*base;
			base = base*2;
		}
		return decval;
	}

	public static void main(String[] args) {
		int num =1010;
		System.out.println(decimal(num));
		// TODO Auto-generated method stub

	}

	

}
