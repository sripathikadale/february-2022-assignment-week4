package assignment4;

public class maxvalue {
	public static int number(int a,int b) {
		int maximum =Math.max(a, b);
		return maximum;
	}

	
	
	
	public static int numb(int a,int b,int c) {
		int maximum =Math.max(a, b);
		if(a>b && a>c  )
		{
			
			System.out.println("maximum number is :: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("maximum number is :: "+b);
		}
		else
		{
			System.out.println("maximum number is :: "+c);
		}
		return maximum;
	}
	

	public static void main(String[] args) {
		int maximum = number(5,7);
		System.out.println("maximum number is :: "+maximum);
		
		int maximum1=numb(3,12,9);
		// TODO Auto-generated method stub

	}

}
