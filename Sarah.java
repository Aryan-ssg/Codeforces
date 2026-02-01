
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sarah {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c = sc.nextInt();
        int tc = sc.nextInt();
        int cf = 1;
        int cost = 0;
        for (int i = 1; i <= c; i++) {
            if (tc <= c - i) {
                cf--;
                cost = cost + ((tc - cf) * i);
                cf = tc;
                if(cf==c-i){
                    break;
                }

            } else if (tc > c - i) {
                cf--;
                cf = cf + c - i;
                cost=cost+(i*(c-i));
                break;
            }

        }
        System.out.println(cost);


    }

}
