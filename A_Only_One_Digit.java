
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Only_One_Digit {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        // String input = br.readLine();
        // String[] s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        //     arr[i] = Integer.parseInt(s[i]);
        // }
        for(int q=0;q<tc;q++){
            int x = Integer.parseInt(br.readLine());
            int nod=(int)Math.log10(x)+1;
            
            int[] arr=new int[nod];
            for(int i=0;i<nod;i++){
                arr[i]=x%10;
                x=x/10;
                
            }
            int ans=arr[0];
            for(int j=0;j<nod;j++){
                if(arr[j]<ans){
                    ans=arr[j];
                }
            }
            sb.append(ans+"\n");

        }
        System.out.println(sb);
        
        
        
        


        

    }
}
