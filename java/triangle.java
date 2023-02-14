/*
n=4

      * 
    * * *
  * * * * * 
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      * 
      
 */

import java.util.Scanner;
class triangle
{
    public static void main (String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<temp;j++)
            {
                System.out.print("  ");
            }
            temp--;
            for(int j=0;j<(i*2)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverse of traingle
        int k=(n*2)-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<temp;j++)
            {
                System.out.print("  ");
            }
            temp++;
            
            for(int j=k;j>0;j--)
            {
                System.out.print("* ");    
            }
            k-=2;
            System.out.println();
        }

    }
}