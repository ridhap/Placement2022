import java.util.*;
class StringDemoLastWord
{
	public static void main(String[] args) 
	{
		String test = new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your String-");
		test=scan.nextLine();
        //System.out.println(test.lastIndexOf(" "));
        String lastWord = test.substring(test.lastIndexOf(" ")+1);
		System.out.println(lastWord);
}
}
