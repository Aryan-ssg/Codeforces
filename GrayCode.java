import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        // ArrayList<Integer> arr=new ArrayList<>();

        for (int i = 0; i < Math.pow(2, n); i++) {
            

            String s = String.format("%" + n + "s",Integer.toBinaryString(i)).replace(' ','0') ;

            char[] arr1 = s.toCharArray();
            int[] arr = new int[n];
            int box = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    arr[j] = arr1[j]-'0';
                    box = arr1[j]-'0';
                    sb.append(arr[j]);
                } else {
                    int prevbit=box;
                    int currbit=arr1[j]-'0';
                    arr[j] = prevbit^currbit;
                    box = arr1[j]-'0';
                    sb.append(arr[j]);
                }

            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
