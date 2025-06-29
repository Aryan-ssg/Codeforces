import java.util.*;

public class _1325B {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int count=0;
        int n=sc.nextInt();
        for(int z=0;z<n;z++) {
            count=1;
            int n1 = sc.nextInt();
            int[] arr = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            for (int i = 0; i < n1 - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    continue;
                } else {
                    count++;
                }
            }
            System.out.println(count);

        }



    }
}
