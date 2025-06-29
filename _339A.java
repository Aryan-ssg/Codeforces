import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _339A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        
        String[] temp = s.split("\\+");
        int[] arr = new int[temp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + "+");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        

    }

}
