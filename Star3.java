import java.lang.String;
import java.lang.System;

class Star3
{
    public static void main(String[] args)
    {
        	int n = Integer.parseInt(args[0]);
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)		// change it from (n-1) to n and execute it and observe
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }
}