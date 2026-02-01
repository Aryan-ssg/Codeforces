
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class C_Isamatdin_and_His_Magic_Wand {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String[] s = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            boolean even=false;
            boolean odd=false;
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    even=true;
                }
                else{
                    odd=true;
                }
                if(even==true && odd==true){
                    break;
                }
            }
            if(even==true && odd==true){
                Arrays.sort(arr);
            }

            for(int i=0;i<n;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
