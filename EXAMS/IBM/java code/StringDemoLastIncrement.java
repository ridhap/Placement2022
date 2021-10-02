import java.util.*;
class StringDemoLastIncrement 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=new String();

		System.out.println("Enter String--");
		s1=scn.nextLine();
		//for(int i=0;i<s1.length();i++)
		//{
			                      ;
			int charValue=s1.charAt(s1.length()-1);
			char c=Character.valueOf((char) (charValue+1));
		//}
		System.out.println(s1.substring(1,s1.length())+c);
	}
}
