package assignment4;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class middlelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			 System.out.println("enter the num :: ");
			 int num = sc.nextInt(); 
			list.add(String.valueOf(i));
		 
		}
		   int mid = list.size()/2; 
		   String midvalue = list.get(mid);
		   System.out.println("middle element of array is ::"+midvalue);
}
}
