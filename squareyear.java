import java.util.*;

public class squareyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int z=0;z<tc;z++){
            int n=sc.nextInt();
            double sr=Math.sqrt(n);
            if(n==0000){
                System.out.print(0+ " ");
                System.out.print(0);
                System.out.println();
                
                continue;
            }


            if(sr!=(int)sr){
                System.out.print(-1);
            }
            else {
                int key=(int)sr;
                System.out.print(key+" ");
                System.out.print(0);
            }
        System.out.println();

        }
        




    }
}

































