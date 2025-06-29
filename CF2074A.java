import java.lang.Math;
import java.util.*;
public class CF2074A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int j=0;j<n;j++) {
           int l=sc.nextInt();
           int r=sc.nextInt();
           int d=sc.nextInt();
           int u=sc.nextInt();


           if(l==r && r==d && d==u){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
        }





    }
}
