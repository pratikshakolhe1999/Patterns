package pattern;

public class LeftAngleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n=4;
		for(int i = 1; i <= 4; i++)
		{
            for(int j = 3; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) 
            {
            System.out.print("*");
            }
            System.out.println(" ");
	}

}
}
/*
 
   
    *
   **
  ***
 ****
 */


/**int n=4;
for(int i = 0; i < n; i++)
{
    for(int j = 0; j <= n-1; j++) 
    {
        System.out.print("* ");
    }
    
    System.out.println();
}

output=
* * * * 
* * * * 
* * * * 
* * * * 
**/