import java.util.*;
class StringDemoStringCoppy 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter String--");
		s1=scn.nextLine();
		String s2=new String();
		for(int i=0;i<s1.length();i++)
		{
			s2 +=s1.charAt(i);
		}
		System.out.println("2nd String is-"+s2);

	}
}
