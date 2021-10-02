import java.util.*;
class StringDemoRemoveLetter 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter your String");
		s1=scn.nextLine();
		System.out.println("Enter your Character");
		char c=scn.next().charAt(0);
		String s2=new String();
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			if(a!=c)
			{
				s2 += s1.charAt(i);
			}
	    }
		System.out.print(s2);
}
}
