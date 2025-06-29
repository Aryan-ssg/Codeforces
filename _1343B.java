import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1343B {
    public static void main(String[] args) throws NumberFormatException, IOException{
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int tc=Integer.parseInt(br.readLine());
        for(int z=0;z<tc;z++){
            int n=Integer.parseInt(br.readLine());
            if((n/2)%2!=0){
                sb1.append("NO\n");
            }
            else{
                int count =0;
                sb1.append("YES\n");
                for(int i=2;i<=n;i=i+2){
                    sb1.append(i+" ");
                    
                    if(i!=n){
                        sb2.append(i-1+" ");
                        count++;
                    }
                    
            
                }
                sb2.append(n+count+" ");
                sb1.append(sb2+"\n");
                sb2.setLength(0);

            }

        }
        System.out.println(sb1);











    }
}
