
import java.util.Scanner;
class FLAMES extends FLAMES2{
    /**
     * @param args 
     */
    // HI WELCOME TO GITHUB
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first name :");
        String s1=s.next();
        System.out.print("Enter second name :");
        String s2=s.next();
        int count=0;
        s.close();
        char n1[]=s1.toCharArray();
        char n2[]=s2.toCharArray();
        for(int i=0;i<n1.length;i++)
        {
            for(int j=0;j<n2.length;j++)
            {
                if(n1[i]!='0'){
                    if(n1[i]==n2[j]){
                        n1[i]='0';
                        n2[j]='0';
                        break;
                    }
                }else{
                    break;  
                }
            }
        }
        for(int j=0;j<n1.length;j++){
            if(n1[j]!='0')
                count++;
        }
        for(int j=0;j<n2.length;j++){
            if(n2[j]!='0')
                count++;
        }
        System.out.print(count);
        //is it working
    }
}