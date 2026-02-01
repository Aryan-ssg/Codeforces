
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SonyaHotels {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] s=input.split(" ");
        int n=Integer.parseInt(s[0]);
        int dis=Integer.parseInt(s[1]);
        input=br.readLine();
        String[] s1=input.split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int num=2;
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==2*dis){
                num+=1;

            }
            else if(Math.abs(arr[i]-arr[i+1])>=2*dis){
                num+=2;
            }

        }
        System.out.println(num);






        
    }
}
