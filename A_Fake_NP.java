
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Fake_NP {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int l=Integer.parseInt(s[0]);
        int r=Integer.parseInt(s[1]);
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        //     arr[i] = Integer.parseInt(s[i]);
        // }
        if(l==r){
            System.out.println(l);
        }else{
            System.out.println(2);
        }
        
        
        


        

    }
}
