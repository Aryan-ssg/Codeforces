import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class NumSpiral {
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            String s=br.readLine();
            String[] arr=s.split(" ");

            long r=Long.parseLong(arr[0]);
            long c=Long.parseLong(arr[1]);
            long diag=0;
            if(r>c){
                diag=(r*r)-(r-1);
                if(r%2==0){
                    //System.out.println(diag+(r-c));
                    sb.append(diag+(r-c)).append("\n");
                    continue;
                }else {
                    //System.out.println(diag-(r-c));
                    sb.append(diag-(r-c)).append("\n");
                    continue;
                }

            }
            else if(r==c){
                long num= r*c;
                //System.out.println((num-(r-1)));
                sb.append(num-(r-1)).append("\n");
                continue;
            }else{
                diag=(c*c)-(c-1);
                if(c%2==0){
                    //System.out.println(diag-(c-r));
                    sb.append(diag-(c-r)).append("\n");
                    continue;
                }else{
                    //System.out.println(diag+(c-r));
                    sb.append(diag+(c-r)).append("\n");
                    continue;
                }



            }



        }
        System.out.println(sb);





    }

    
}
