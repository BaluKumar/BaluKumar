import java.util.Scanner;;
public class FLAMES2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number : ");
        int count=s.nextInt();
        s.close();
        char a[]={'F','L','A','M','E','S'};
        int i=0,c=0,k=1;
        int itr=1;
        while (i<a.length-1) {
            if (a[c]!='0'&&count==k) {
                a[c]='0';
                i++;
                k=1;
                c++;
            }
                if (c<a.length-1) {
                    c++;
                } else {
                    c=0;
                }
                if (k>=count) {
                    k=1;
                } else {
                    k++;
                }
            if (itr++>200) {
                System.out.println("pls Check the code ");
                break;
            }
            
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }
    public static char toFlamesChar(int count){
        count=4;
        char a[]={'F','L','A','M','E','S'};
        int i=0,c=0,k=1;
        while (i<a.length-1) {
            if (a[c]!='0'&&count==k) {
                a[c]='0';
                i++;
                k=1;
            } else {
                if (c<a.length) {
                    c++;
                } else {
                    c=0;
                }
                if (k>=count) {
                    k=1;
                } else {
                    k++;
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
        return '0';
    }
}
