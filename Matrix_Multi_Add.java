package DSA_practice.Assignment_1;

import java.util.Scanner;

public class Matrix_Multi_Add {
	
	public static void main(String args[])
	{
		int a[][]=  {{5,6,7,8},
                {1,2,3,4},{3,4,6,5}};

    int b[][]=  {{10,20,30,40},
                 {2,3,4,5},{3,4,5,6}
                };
    int c[][]= new int[4][4];
    System.out.println("press 1 for adding two matrix");
	System.out.println("press 2 for mutiplying two matrix");
	System.out.println("Exit");
	Scanner s= new Scanner(System.in);
	 System.out.print("make your choice:");  
     int ch = s.nextInt(); 
      switch (ch)
      {
      case 1:
    	  System.out.print("matrix:-");
    	  for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<4;j++)
	            {
	                c[i][j]=a[i][j]+b[i][j];
	            }
	        }
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<4;j++)
	            {
	        System.out.print ("  "+ c[i][j]);
	            }
	        }break;
      case 2:
    		System.out.println("matrix:-");
    		for (int i= 0 ; i < 3 ; i++ ) 
            for (int j= 0 ; j <4 ;j++)
    		{
    		c[i][j]=0;
    		for (int k= 0 ; k <3;k++ )
    		{
    		c[i][j] += a[i][k]*b[k][j] ;
    		}
    		System.out.print(c[i][j]+" ");
    		}break;
      default:
          System.out.println("Exit \n\n");
    }
      }
}


