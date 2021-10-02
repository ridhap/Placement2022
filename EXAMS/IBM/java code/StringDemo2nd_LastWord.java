import java.util.*;
class StringDemo2nd_LastWord
{
	public static void main(String[] args) 
	{
		String test = new String();
		//String sp=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your String-");
		test=scan.nextLine();
		for(String sp:test.split(" "))
		{


        
        //String lastWord = test.substring(5,test.lastIndexOf(" ")+1);
		System.out.println(sp);
		int i=sp.length();
		//System.out.println(i);
		String lastWord = test.substring(i+1,test.length());
		System.out.println(lastWord);



		break;
		}
		
}
}
