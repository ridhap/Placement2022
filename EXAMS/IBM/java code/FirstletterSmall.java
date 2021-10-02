eimport java.util.*;
class FirstletterSmall 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter Caps String");
		s=scan.nextLine();
		for(String s1:s.split(" "))
		{
			char c=s1.charAt(0);
			System.out.print(Character.toLowerCase(c));

			System.out.print(s1.substring(1,s1.length()));
			System.out.print(" ");

		}
	}
}
