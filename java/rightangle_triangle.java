/*
n=4;

 * 
 * * 
 * * *
 * * * *
 * * *
 * *
 * 

 */
import java.util.Scanner;
class rightAngle_triangle
{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no.of.rows: ");
        int n=s.nextInt();
        s.close();
        //rightAngle_Triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //inverse rightAngle_Triangle
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}