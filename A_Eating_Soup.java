
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Eating_Soup {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // String input = br.readLine();
        // String[] s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        //     arr[i] = Integer.parseInt(s[i]);
        // }
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m==0){
            System.out.println(1);
        }else if(m>n/2){
            System.out.println(n-m);
        }else{
            System.out.println(m);
        }
        


        

    }
}
