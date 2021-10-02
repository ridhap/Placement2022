import java.util.*;
class StringDemoReverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name");
		Scanner s=new Scanner(System.in);
		String str=new String();
		str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
		System.out.print(str.charAt(i)+" ");
	}
}
}
