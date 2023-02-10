import java.lang.String;
import java.lang.System;

class Star4
{
    public static void main(String[] args)
    {
        	int n = Integer.parseInt(args[0]);
	
		for(int i=1;i<=n;i++)
		{
			for(int s=n-1;s>=i;s--)		// printing space from (n-1) to 0 th time
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)		// same logic as in Star1.java
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }
}	