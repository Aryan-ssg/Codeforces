
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Difficult_Contest {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < tc; q++) {
            String input = br.readLine();
            char[] arr=input.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='T'){
                    sb.append("T");
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!='T'){
                    sb.append(arr[i]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }

    }
}
