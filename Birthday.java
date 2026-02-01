
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Birthday {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        // int[] arr = new int[2];
        // for (int i = 0; i < 2; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }
        BigInteger n = new BigInteger((s[0]));
        BigInteger m = new BigInteger((s[1]));
        BigInteger k = new BigInteger((s[2]));
        BigInteger l = new BigInteger((s[3]));
        
        
        // o=1 c!=0 no
        BigInteger add=l.add(k);

        BigInteger i;
        BigInteger[] arr=add.divideAndRemainder(m);
        
        if(arr[1]==BigInteger.ZERO){
            i=arr[0];


        }else{
            i=arr[0].add(BigInteger.ONE);
        }
        
       
        // n.subtract(k).compareTo(l)>=0 &&
        if( n.subtract(k).compareTo(l)>=0 && n.compareTo(i.multiply(m))>=0 ){
            System.out.println(i);

        }else{
            System.out.println(-1);
        }
    }
}
