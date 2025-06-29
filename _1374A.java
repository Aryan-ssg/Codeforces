import java.util.*;

public class _1374A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int z=0;z<tc;z++) {
            int dsor = sc.nextInt();
            int rder = sc.nextInt();
            int n = sc.nextInt();
            int currrem=n%dsor;
            if(currrem<rder){
                System.out.println(n-currrem-dsor+rder);
            }
            else{
                System.out.println(n-currrem+rder);
            }



        }

    }
}
