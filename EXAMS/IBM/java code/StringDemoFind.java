import java.util.*;
class StringDemoFind 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Scanner sc1=new Scanner(System.in);
		String s=new String();
        //char c;
		System.out.println("Enter your String");
		s=sc.nextLine();
		System.out.println("Emter char--");
		char c=sc.next().charAt(0);
		int i,j=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{

				j++;
				break;
			}
		}
		if (j!=0)
		{
			System.out.println("Character Found at"+" "+(i+1));
		}
		else
		{

		System.out.println("Character not Found");
		}
}
}
