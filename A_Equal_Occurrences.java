
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Equal_Occurrences {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            

            String input = br.readLine();
            String[] s = input.split(" ");
            Map<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                int key=Integer.parseInt(s[i]);
                
                hm.put(key,hm.getOrDefault(key,0)+1); 
            }
            int max=0;
            for(int i:hm.keySet()){
                max=Math.max(max,hm.get(i));
            }
            int count=0;
            int ans=0;
            for(int i=max;i>0;i--){
                count=0;
                for(int j:hm.keySet()){
                    if(hm.get(j)>=i){
                       count++;
                    }
                }
                ans=Math.max(count*i,ans);

            }
            sb.append(ans).append("\n");

        

        }
        System.out.println(sb);

    }
}
