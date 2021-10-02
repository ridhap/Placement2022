import java.util.*;
class StringDemoRemove2ndLast 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter your string");
		s1=scn.nextLine();
		String finalstring[]=s1.split(" ");
		
		String last=finalstring[finalstring.length-1];
		for(int i=0;i<finalstring.length-2;i++)
		{
			System.out.print(finalstring[i]+" ");
	    }
		System.out.print(last);
}
}
