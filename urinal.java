//author - Srikruthi Vedantham
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
			}
		}
		if(c==0)
			return true;
		else
			return false;
	}
}