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
public class mod_butterfly
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter even number to get accurate patten :");
		int n=s.nextInt();
        int k=n/2;
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=n;j++){
                    if(j<=i || j>n-i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }else{
                for (int j=1;j<=n ;j++ ){
                    if (k>=j||n-k<j){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                } k--;
                System.out.println();
            }
        }
	}
}

/*
#include <stdio.h>
#include <conio.h>
using namespace std;
void main(){
    int n,k,i;
    cout<<"Enter even number that is greater than 4 :"
    cin>>n;
    k=n/2;
    for(i=1;i<=n;i++){
        if(i<=n/2){
            for(int j=1;j<=n;j++){
                if(j<=i || j>n-i){
                    cout<<"* ";
                }else{
                    cout<<"  ";
                }
            }
            cout<<\n;
        }else{
            for (int j=1;j<=n ;j++ ){
                if (k>=j||n-k<j){
                    cout<<"* ";
                } else{
                    cout<<"  ";
                }
            } k--;
            cout<<\n;
        }
    }
}*/