import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1791C {
    public static void main(String[] args) throws NumberFormatException, IOException{
        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());

        for(int z=0;z<tc;z++){
            int len=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int n=s.length();
            int ans=n;
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    ans=ans-2;
                }
                else {
                    break;
                }


            }
            sb.append(ans+"\n");
            // System.out.println(s.length());
        }
        System.out.println(sb);





    }
}
