
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ropewalkers {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        Arrays.sort(arr);
        int diff1=Math.abs(arr[0]-arr[1]);
        int diff2=Math.abs(arr[1]-arr[2]);
        int time=0;
        if(diff1<d){
            time=time+(d-diff1);

        }
        if(diff2<d){
            time=time+(d-diff2);

        }
        System.out.println(time);
        


    }

}
