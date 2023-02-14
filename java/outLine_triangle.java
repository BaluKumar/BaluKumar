/*
n=4

      * 
    *   *
  *       * 
*           *
*           *
  *       *
    *   *
      * 
 */
import java.util.Scanner;
class outLine_triangle
{
    public static void main(String[] args) {
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
                if(j==0|| j==(i*2)-2){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //inverse outLine
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
                if(j==k||j==1){
                    System.out.print("* ");    
                }else{
                    System.out.print("  ");
                }
            }
            k-=2;
            System.out.println();
        }
    }
}