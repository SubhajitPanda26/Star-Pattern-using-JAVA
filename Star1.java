import java.lang.String;
import java.lang.System;

class Star1
{
    public static void main(String[] args)
    {
        	int n = Integer.parseInt(args[0]);	// input taking through cmd line arguments
	
		for(int i=1;i<=n;i++)			// cursor shifting from row 1 to n
		{
			for(int j=1;j<=i;j++)		// (j depends on i)...if j<=n then it will print a square pattern
			{
				System.out.print("*");
			}
			System.out.println();		// for going to the next line 
		}
    }
}