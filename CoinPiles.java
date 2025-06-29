import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinPiles {
    public static void main(String[] args) throws NumberFormatException, IOException{
        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int tc=Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            String s=br.readLine();
            String[] arr=s.split(" ");
            int lp=Integer.parseInt(arr[0]);
            int rp=Integer.parseInt(arr[1]);
           
            if(lp>rp){
                int box=lp;
                lp=rp;
                rp=box;
            }
            if(rp>2*lp || (lp+rp)%3!=0){
                sb.append("NO\n");
                continue;
            }

            
           sb.append("YES\n");
        
           
        }
        System.out.println(sb);
    }
}
