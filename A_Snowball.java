
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Snowball {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        // String input = br.readLine();
        // String[] s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        //     arr[i] = Integer.parseInt(s[i]);
        // }
        int sw=sc.nextInt();
        int sh=sc.nextInt();
        int w1=sc.nextInt();
        int h1=sc.nextInt();
        int w2=sc.nextInt();
        int h2=sc.nextInt();

        if(h1<h2){
            int temp=h1;
            h1=h2;
            h2=temp;
            temp=w1;
            w1=w2;
            w2=temp;
        }
        
        for(int i=sh;i>0;i--){
            sw+=i;
            if(i==h1){
                sw-=w1;
            }
            else if (i==h2){
                sw-=w2;
            }
            if(sw<0){
                sw=0;
                
            }



        }

        System.out.println(sw);

        
        
        
        


        

    }
}
