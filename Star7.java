import java.lang.String;
import java.lang.System;

class Star7
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
				System.out.print("* ");
			}
			System.out.println();
		}
    	}
}	