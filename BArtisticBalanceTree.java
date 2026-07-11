
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BArtisticBalanceTree {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            input = br.readLine();
            s = input.split(" ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(s[i]);
            }
            input = br.readLine();
            s = input.split(" ");
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(s[i]);
            }


            long sum=0;
            for(int i=0;i<n;i++){
                sum+=arr1[i];
            }
            int [] odd=new int[Math.floorDiv(n, 2)];
            int [] even =new int[n-odd.length];

            int evenind=0;
            int oddind=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    even[evenind]=arr1[i];
                    evenind++;
                }else{
                    odd[oddind]=arr1[i];
                    oddind++;
                }

            }
            Arrays.sort(even);
            Arrays.sort(odd);
            int left=0;
            int right=even.length-1;

            while(left<right){
                int temp=even[left];
                even[left]=even[right];
                even[right]=temp;

                left++;
                right--;
            }
            left=0;
            right=odd.length-1;

            while(left<right){
                int temp=odd[left];
                odd[left]=odd[right];
                odd[right]=temp;

                left++;
                right--;
            }

            int evenpoint=0;
            int oddpoint=0;
            for(int i=0;i<m;i++){
                if((arr2[i]-1)%2==0 && evenpoint<even.length){
                    if(evenpoint>0 && even[evenpoint]<0){
                        continue;
                    }
                    sum-=even[evenpoint];
                    evenpoint++;
                    
                }else if((arr2[i]-1)%2!=0 && oddpoint<odd.length){
                    if(oddpoint>0 && odd[oddpoint]<0){
                        continue;
                    }
                    sum-=odd[oddpoint];
                    oddpoint++;
                }

            }
            sb.append(sum+"\n");
            



        }
        System.out.println(sb.toString());

    }
}
