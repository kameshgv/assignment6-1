package Assignment6;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string to be splitted ");
		String tobeSplitted=scan.nextLine();
		String breakAt="abc";
		scan.close();
		Mysplit(tobeSplitted,breakAt);
		}
	static void Split(String tobeSplitted,String breakAt )
	{
		for(int i=0; i<=tobeSplitted.length();i++)
		{
			if (tobeSplitted.charAt(i)==' ')
			{
				System.out.println("");
				continue;
			}
			System.out.println(tobeSplitted.charAt(i));
		}
	}
}

