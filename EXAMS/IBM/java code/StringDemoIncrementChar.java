import java.util.*;
class StringDemoIncrementChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		String b="";

		System.out.println("Enter your string--");
		s=sc.nextLine();
		for(char c: s.toCharArray())
		{
			b +=Character.toString((char)(((c-'a'+1)%26)+'a'));

	    }
		System.out.println(b);

}
}
