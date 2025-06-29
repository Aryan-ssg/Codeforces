import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwoSets {
    public static void main(String[] args) throws IOException{
       
    
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        long sum=((long)n*(n+1))/2;
        long num=sum/2;

        if(sum%2!=0){
            sb1.append("NO");
            System.out.println(sb1);

        }else{
            for(int i=n;i>0;i--){
                if(num>=i){
                    l1.add(i);
                    num-=i;
                }
                else{
                    l2.add(i);

                }
            }
            for(int i:l1){sb1.append(i+" ");}
            for(int i:l2){sb2.append(i+" ");}
            System.out.println("YES");
            System.out.println(l1.size());
            System.out.println(sb1);
            System.out.println(l2.size());
            System.out.println(sb2);

        }




     // StringBuilder sb1=new StringBuilder();
        // StringBuilder sb2=new StringBuilder();
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // int n=Integer.parseInt(br.readLine());
        // long sum=((long)n*(n+1))/2;
        // long num=sum/2;
        
        // if(sum%2!=0){
        //     sb1.append("NO");
        //     System.out.println(sb1);

        // }else{
            
        //     for(int i=n;i>=1;i--){
        //         if(num>=i){
        //             sb1.append(i+" ");
        //             num=num-i;
            
        //         }
        //         else{
        //             sb2.append(i+" ");
        //         }
        //     }
        //     System.out.println("YES");
        //     System.out.println(sb1.length()/2);
        //     System.out.println(sb1);
        //     System.out.println(sb2.length()/2);
        //     System.out.println(sb2);
        // }
    
    }
    
}
