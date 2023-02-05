import java.lang.String;
import java.lang.System;

class Star2
{
    public static void main(String[] args)
    {
        	int n = Integer.parseInt(args[0]);
	
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)			// j starts in reverse order
			{	
				System.out.print("*");
			}
			System.out.println();
		}
    	}
}