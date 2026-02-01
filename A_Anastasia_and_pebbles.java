
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Anastasia_and_pebbles {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
         input = br.readLine();
         s = input.split(" ");
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        

        int days=0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                days+=arr[i]/(2*k);
                
                if(arr[i]%(2*k)>k){
                    days++;
                    arr[i]=0;
                    continue;
                }
                arr[i]=arr[i]%(2*k);
            }
        }
        int nonzero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }else{
                nonzero++;
            }
        }
        if(nonzero%2==0){
            days+=nonzero/2;
        }else{
            days+=(nonzero/2)+1;
        }
        System.out.println(days);
        


        

    }
}
