import java.io.*;
import java.util.*;
import java.lang.*;


class Dir1
{
	public void listall(String p)
	{
		try
		{
			File f= new File(p);
			File[] fa= f.listFiles();
			for(File A:fa)
			{
				if(A.isFile()==false)
				{
					System.out.println("Sub-directory : "+A);
					listall(A.getAbsolutePath());
					
				}
				else
				{
					System.out.println("File : "+A);
				}
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}

class Slot10_1
{
	public static void main(String args[])
	{
		String s;
		Dir1 d= new Dir1();
		try
		{
			System.out.println("Enter a path of the file : ");
			
			Scanner sc= new Scanner(System.in);
			s=sc.nextLine();
			d.listall(s);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error : "+e);
		}
	}
}
