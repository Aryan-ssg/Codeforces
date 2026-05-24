
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CTrafficLight {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            char curr = s[1].charAt(0);

            input = br.readLine();
            input=input+input;
            char[] arr = input.toCharArray();
            n=arr.length;
            int time = 0;
            int nearestg=-1;
            for (int i = n-1; i >=0; i--) {
                if (arr[i] == 'g') {
                    nearestg=i;
                }
                else if(arr[i]==curr && nearestg!=-1){
                    time=Math.max(time, nearestg-i);
                }
               
            }
            
            sb.append(time + "\n");

        }
        System.out.println(sb.toString());

    }
}
