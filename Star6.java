import java.lang.String;
import java.lang.System;

class Star6
{
    	public static void main(String[] args)
    	{
        	int n = Integer.parseInt(args[0]);
	
		for(int i=1;i<=n;i++)
		{
			for(int s=n-1;s>=i;s--)		
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)		
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++)			//increase a space thats why s=2 to s=1 in (mid+1)th row
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)			// reduce printing no of * in (mid+1)th row
			{
				System.out.print("*");
			}
			System.out.println();
		}
    	}
}	