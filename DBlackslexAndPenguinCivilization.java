
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class DBlackslexAndPenguinCivilization {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            int n = Integer.parseInt(br.readLine());

            int num=((int)Math.pow(2,n))-1;
            boolean [] arr=new boolean[num+1];
            
            StringBuilder s=new StringBuilder(Integer.toBinaryString(num));
            for(int i=n;i>=1;i--){
                int start=(1<<i)-1;
                while(start<=num){
                    if(arr[start]==false){
                        sb.append(start+" ");
                        arr[start]=true;
                    }
                    start+=1<<i;
                }
                

            }
            for(int i=0;i<num+1;i++){
                if(arr[i]) continue;
                sb.append(i+" ");
                
            }
            sb.append("\n");
            

            
            

        }
        System.out.println(sb.toString());

    }
}
