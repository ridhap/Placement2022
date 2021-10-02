import java.io.*;
class StringDemoReverseFrmLastWord 
{
	public static void main(String[] args) throws IOException  
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String s=new String();
		//String s1=new String();
		System.out.println("Enter string--");
		s=br.readLine();
		String s3[]=s.split(" ");
		for(int i=s3.length-1;i>=0;i--)
		{
			System.out.print(s3[i]+" ");
		}
	}
}