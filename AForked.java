
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AForked {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            
            input = br.readLine();
            s = input.split(" ");
            int xk=Integer.parseInt(s[0]);
            int yk=Integer.parseInt(s[1]);

            input = br.readLine();
            s = input.split(" ");
            int xq=Integer.parseInt(s[0]);
            int yq=Integer.parseInt(s[1]);

            int[] dx={1,1,-1,-1};
            int[] dy={1,-1,1,-1};

            Set<String> str1=new HashSet<>();
            Set<String> str2=new HashSet<>();
            

            for(int i=0;i<4;i++){
                str1.add((xk + dx[i]*a) +","+(yk + dy[i]*b) );
                str2.add((xq + dx[i]*a) +","+(yq + dy[i]*b));

                str1.add((xk + dx[i]*b) +","+(yk + dy[i]*a) );
                str2.add((xq + dx[i]*b) +","+(yq + dy[i]*a) );

            }
            int count=0;
            for(String kpoint:str1){
                if(str2.contains(kpoint)){
                    count++;
                }

            }
            
            

            sb.append(count+"\n");
        }
        System.out.println(sb.toString());

    }
}

