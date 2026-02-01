
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Sushi_for_Two {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        
        
        int c1=0;
        int c2=0,result=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c1++;
            }
            if(arr[i]==2){
                c2++;
            }

            
            if(i==n-1 || arr[i]!=arr[i+1]){
                if(c1>=c2){
                    int newresult=2*c2;
                    if(newresult>result){
                        result=newresult;
                    }
                }
                else if(c1<c2){
                    int newresult=2*c1;
                    if(newresult>result){
                        result=newresult;
                    }
                }
                if(arr[i]==1){
                    c2=0;
                }else if(arr[i]==2){
                    c1=0;
                }
            }
        }
        sb.append(result);
        System.out.println(sb);
        
        


        

    }
}
