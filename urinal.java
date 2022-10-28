//author - Srikruthi Vedantham

import java.lang.*;
import java.io.*;
import java.util.*;

public class urinal
{
	public static void main(String[] args)
	{
		
	}
	public boolean validateString(String inpStr)
	{
		int c=0;
		for(int i=0;i<inpStr.length();i++)
		{
			if(inpStr.charAt(i)=='1'  || inpStr.charAt(i)== '0'){
				c=0;
			}
			else
			{
				c=1;
				break;
			}
		}
		if(c==0)
			return true;
		else
			return false;
	}
	
	public static int openFile(String fileName)
	{
		String[] arrStr = new String[100];
		try
			{
				
				FileInputStream fstream = new FileInputStream(fileName);
    			DataInputStream in = new DataInputStream(fstream);
    			BufferedReader br = new BufferedReader(new InputStreamReader(in));
    			String data;
				while((data=br.readLine())!=null)
				{
					arrStr = data.split(" ");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		return (arrStr.length);
	}

	public static int countUrinals(String s)
	{
		String orgStr = s;
		int countMen = 0;
		for(int i=0;i<s.length()-1;i++) 
		{
			if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
			{
				countMen=-1;
				break;
			}
			if(i==0)
			{
				if(s.charAt(i)=='0' && s.charAt(i+1)=='0')
				{
					s = '1'+ s.substring(i+1);
					countMen+=1;
				}
			}
			else
			{
				if(s.charAt(i)=='0' && s.charAt(i-1)=='0' && s.charAt(i+1)=='0')
				{
					s = s.substring(0,i-1)+ '1' + s.substring(i+1);
					countMen+=1;
				}
			}
		}
		int m = s.length();
		if(s.charAt(m-1)=='0' && s.charAt(m-2)=='0')
		{
			s = s.substring(0,m-1)+'1';
			countMen+=1;
		}
		if(countMen==0)
			return 0;
		else if(countMen==-1)
			return -1;
		else
			return countMen;
	}
}