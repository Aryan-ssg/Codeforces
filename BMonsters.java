
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BMonsters {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
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

            Integer[] ind=new Integer[n];
            for(int i=0;i<n;i++){
                ind[i]=i;
            }

            Arrays.sort(ind,(x,y)->{
                int ex= arr[(int)x]%k==0 ? k:arr[(int)x]%k;

                int ey= arr[(int)y]%k==0 ? k:arr[(int)y]%k;

                if(ex!=ey){
                    return ey-ex;
                }else{
                    return x-y;
                }
            });
            // int[] farr=new int[n];
            

            for(int i=0;i<n;i++){
                sb.append(ind[i]+1+" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
}
