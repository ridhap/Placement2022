import java.util.*;
class StringDemoHighestCountLetter 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter your String");
		s1=scn.nextLine();
		int count=0;
		int max=0;
		char tempChar=' ';
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			for(int j=0;j<s1.length();j++)
			{
				if(c==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
			max=count;
			tempChar=s1.charAt(i);
            }
			count=0;
		}
//System.out.println(max);
System.out.println("Higest occurence letter is->"+tempChar+" "+" Total no of occurence is->"+max);
	}
}