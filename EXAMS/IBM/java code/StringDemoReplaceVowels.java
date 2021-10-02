import java.util.*;
class StringDemoReplaceVowels
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=new String();
		System.out.println("Emter your String--");
		str=scan.nextLine();
		String str1=new String();
		str1=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(str1);
	}
}