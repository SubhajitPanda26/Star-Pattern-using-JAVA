import java.lang.String;
import java.lang.System;

class Star5
{
    	public static void main(String[] args)
    	{
        	int n = Integer.parseInt(args[0]);
	
		for(int i=1;i<=n;i++)
		{
			for(int s=2;s<=i;s++)		
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)		// same logic as Star2.java
			{
				System.out.print("*");
			}
			System.out.println();
		}
    	}
}	