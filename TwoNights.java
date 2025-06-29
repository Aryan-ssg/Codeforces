import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNights {
    public static void main(String[] args) throws NumberFormatException, IOException {

        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1 ;i<=n;i++){
            if(i==1){
                sb.append(0).append("\n");
                continue;
            }
            count+=i-2;
            // int ways=((i*(i-1))/2)-(8*count);
            int p=i*i;
            
            long ways=(((long)p*(p-1))/2)-(8*count);

            sb.append(ways).append("\n");
        }
        System.out.println(sb);




    }

}
