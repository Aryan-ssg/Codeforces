
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Stages {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s1 = input.split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        String s = br.readLine();
        // s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int[]  arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i]-'a'+1;
        }
        int num=0;
        int count=0;
        boolean trig=true;
        for(int i=0;i<n && trig;i++){
            int start =arr1[i];
            int check=arr1[i];
            num=arr1[i];
            count=0;
            for(int j=i;j<n;j++){
                if(j==i){
                    count++;
                }
                if(arr1[j]-check>1){
                    check=arr1[j];
                    num+=arr1[j];
                    count++;
                }
                if(count==k){
                    trig=false;
                    break;
                }
            }
        }
        if(trig){
            System.out.println(-1);
        }else{
            System.out.println(num);
        }
        

    }
}
