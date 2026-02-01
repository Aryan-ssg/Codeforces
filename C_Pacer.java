
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class C_Pacer {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int noofcond=Integer.parseInt(s[0]);
            int min=Integer.parseInt(s[1]);
            
            int[] arr=new int[min+1];
            int start=0;

            for(int i=0;i<noofcond;i++){
                input=br.readLine();
                s=input.split(" ");
                int a=Integer.parseInt(s[0]);
                int b=Integer.parseInt(s[1]);
                for(int j=start;j<a;j++){
                    arr[j]=-1;

                }
                arr[a]=b;
                start=a+1;
                
            }
            while(start<min+1){
                arr[start]=-1;
                start++;
            }
            
           

            
            arr[0]=0;
            
            int score=0;
            

            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1]==-1){
                    score++;
                    if(arr[i]==0){
                        arr[i+1]=1;
                    }else{
                        arr[i+1]=0;
                    }
                    
                }
                else if(arr[i]!=arr[i+1]){
                    score++;
                }

            }
            sb.append(score).append("\n");
            
        }
        System.out.println(sb);

    }
}
