// author - Srikruthi Vedantham

import java.lang.*;
import java.util.*;
import java.io.*;

public class urinal {
	public static void main(String[] args)
	{
		System.out.println("1. File Input \n 2. Keyboard Input");
		Scanner sc =new Scanner(System.in);
		int s = Integer.parseInt(sc.nextLine());

        if(s==1)
        {
			System.out.println("Enter Strings: ");
            getString();
        }
		else
		{
			System.out.println("Enter File Name");
			String filenm = sc.nextLine();
			openFile(filenm);
		}
	}

	public static void openFile(String s)
	{
		try
			{
				FileInputStream fstream = new FileInputStream(s);
    			DataInputStream in = new DataInputStream(fstream);
    			BufferedReader br = new BufferedReader(new InputStreamReader(in));
    			String data;
				while((data=br.readLine())!=null)
				{
					String[] arrStr = data.split(" ");
					writeFile(arrStr);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

	public static void writeFile(String[] arrayOfStrings)
	{
		try
		{
			int i=1;
			String fname;
			File f = new File("rule.txt");
			while(f.exists())
			{
				f = new File("rule"+i+".txt");
				i++;
			}
			if(!f.exists())
			{
				FileWriter fw = new FileWriter(f.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				for(String t: arrayOfStrings)
				{
					int count = countUrinals(t);
  					bw.write(count + " ");
				}
				bw.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void getString()
	{
		Scanner sc =new Scanner(System.in);
        String[] arrStrings = new String[100];
		String k = sc.nextLine();
        int i=0;
		while(!k.equals("-1"))
		{
			if(validateString(k))
			{
				arrStrings[i++]=k;
			}
			else
			{
				System.out.println("Invalid String Entered");
				break;
			}
			k = sc.nextLine();
		}
        for(int j=0;j<arrStrings.length;j++)
        {
            System.out.println(countUrinals(arrStrings[j]));
        }
	}
	
	public static boolean validateString(String inpStr)
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
			}
		}
		if(c==0)
			return true;
		else
			return false;
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
