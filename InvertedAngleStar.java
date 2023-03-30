package pattern;

import java.util.Scanner;

public class InvertedAngleStar {

	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter number");
		//int n=sc.nextInt();
		
		int i,j,n=3;
		for(i = n; i > 0; i--) 
		{
			for(j = i ; j > 0 ; j--)
			{
			System.out.print("*");
			
			}
			System.out.println();
		}
		
		
		}
}

/*
o/p

* * * 
* * 
* 

*/