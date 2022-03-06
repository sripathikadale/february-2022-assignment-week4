package assignment4;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String name1 = "scotLand";
		String name2 = "scot";
		boolean isfound=false;
		for(int i=0;i<name1.length();i++)
		{
			int s = i;
			int count=0;
			for(int j=i;j<name2.length();j++)
			{
				if(name1.charAt(s)!=name2.charAt(j))
				{
					break;
				}
				else
				{
				count++;
				s++;
				}
			}
			if(count==name2.length())
			{
				isfound=true;
				break;
			}
		}
		if(isfound)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}

		// TODO Auto-generated method stub

	}

}
