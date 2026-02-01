
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Paint_the_Numbers {
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
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        a.add(arr[0]);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<a.size();j++){
                
                if(arr[i]%a.get(j)==0){
                    break;

                }else if(j==a.size()-1){
                    a.add(arr[i]);
                }
                

            }
        }
        
        System.out.println(a.size());
        
        
        


        

    }
}
