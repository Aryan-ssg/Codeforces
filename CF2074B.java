import java.util.*;
public class CF2074B {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int j=0;j<tc;j++) {
            int n = sc.nextInt();
            int[] seq = new int[n];
            for(int i=0;i<n;i++){
                seq[i]=sc.nextInt();
            }
            for (int i = n - 1; i > 0; i--) {
                seq[i - 1] = (seq[i] + seq[i - 1]) - 1;
            }

            System.out.println(seq[0]);


        }

    }
}
