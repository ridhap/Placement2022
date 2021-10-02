import java.util.*;
class StringDemoUpperLowerCase
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=new String();
		System.out.println("Emter your String--");
		str=scan.nextLine();
		StringBuilder sb= new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{
			char c=sb.charAt(i);
			if(Character.isLowerCase(c))
			{
				sb.setCharAt(i,Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c))
			{
				sb.setCharAt(i,Character.toLowerCase(c));
			}


		

	}
	System.out.println(sb);
}
}