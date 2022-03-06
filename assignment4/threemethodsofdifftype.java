package assignment4;

public class threemethodsofdifftype {
	public static int number(int a,int b) {
		int multiplication= a*b;
		return multiplication;
	}
	public static float numb(double d,double e) {
		float  multiplication=(float) (d*e);
		return  multiplication;
		
	}
	public static long num(long e,long f) {
		long  multiplication=e*f;
		return  multiplication;
	}

	public static void main(String[] args) {
		
		int multiplication=number(3,4);
		System.out.println(multiplication);
		float multiplication1=numb(3.2,4.6);
		System.out.println(multiplication1);
		long multiplication2=num(45,98);
		System.out.println(multiplication2);
          
		
		
		
		// TODO Auto-generated method stub

	}

}
