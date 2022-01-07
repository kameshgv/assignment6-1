package Assignment6;
import java.util.Scanner;
public class Split {
public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the string to be splitted");
				String str = sc.nextLine();
				System.out.println("enter the breakpoint character");
				char character = sc.next().charAt(0);
				sc.close();
				int length = str.length();
				char []values = new char[length];
				for(int i = 0; i < length; i++) {
					if(str.charAt(i) == character) 
					{
						str.replace(str.toString(),"");
						System.out.println();
					}
					else
					{
						values[i]=str.charAt(i);
					}
					}
				
				for(char value : values) {
					System.out.print(value);
				}}}
				
			
		


