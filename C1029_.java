import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 1
// 10 1
// 0 0 0 0 0 0 0 1 0 1

public class C1029_ {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int z = 0; z < tc; z++) {
            int n=Integer.parseInt(br.readLine());
            sb.append(2+" ");
            for(int i=n;i>=3;i--){
                sb.append(i+" ");
            }
            sb.append(1+"\n");

            
            

        }
        System.out.println(sb);

    }

}
