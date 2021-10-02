import java.util.*;
class StringDemoIncrementEachWord 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s=new String();
		String s1=new String();
		System.out.println("Enter string--");
		s=scn.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int charValue=s.charAt(i);
			s1 += Character.valueOf((char)(charValue+1));

		    //System.out.println("Hello World!");
	}
	System.out.println(s1);

}
}
