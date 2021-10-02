import java.util.*;

class StringDemoEachReverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String:-");
		Scanner scan=new Scanner(System.in);
		String str=new String();
		str=scan.nextLine();
		
		for(String rev:str.split(" "))
		{
			StringBuffer sb=new StringBuffer(rev);
			//sb.append(rev);
			System.out.print(sb.reverse()+" ");
		
		
}
}
}