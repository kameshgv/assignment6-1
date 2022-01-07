package Assignment6;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		String rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		scan.close();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
	      rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");
		}
}
