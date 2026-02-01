
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Trip_For_Meal {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // String input = br.readLine();
        // String[] s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        //     arr[i] = Integer.parseInt(s[i]);
        // }
        int currpos=0;
        int mindis=0;
        n--;
        //0->rabbit
        //1->owl
        //2->eyeore
        while(n>0){
            if(currpos==0){
                if(a>=b){
                    currpos=2;
                    n--;
                    mindis+=b;
                    continue;
                }
                else{
                    currpos=1;
                    n--;
                    mindis+=a;
                    continue;
                }
            }
            if(currpos==1){
                if(a>=c){
                    currpos=2;
                    n--;
                    mindis+=c;
                    continue;
                }
                else{
                    currpos=0;
                    n--;
                    mindis+=a;
                    continue;
                }
            }
            if(currpos==2){
                if(c>=b){
                    currpos=0;
                    n--;
                    mindis+=b;
                    continue;
                }
                else{
                    currpos=1;
                    n--;
                    mindis+=c;
                    continue;
                }
            }
            
        }
        System.out.println(mindis);





        
        


        

    }
}
