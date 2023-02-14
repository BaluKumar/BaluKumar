/*
n=4 

 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * * 
 * *             * *
 *                 *
 
 */

import java.util.Scanner;
class butterfly{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no.of.rows: ");
        int n=s.nextInt();
        int temp=n*2;
        s.close();
	    for(int i=1;i<=n+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            for (int j=0;j<temp;j++ )
            {
                System.out.print("  ");
            }
            temp-=2;
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=n+1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            temp+=2;
            for (int j=0;j<temp ;j++ ){
                System.out.print("  ");
            } 
            
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}