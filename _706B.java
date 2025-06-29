import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _706B {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int shops=Integer.parseInt(br.readLine());

        
        
        String s=br.readLine();
        String[] temp=s.split(" ");
        int[] arr=new int[shops];

        for(int i=0;i<shops;i++){
            arr[i]=Integer.parseInt(temp[i]);

        }
        Arrays.sort(arr);
        int days=Integer.parseInt(br.readLine());
        int[] arr1=new int[days];
        for(int i=0;i<days;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<days;i++){
            int possible=0;
            for(int j=0;j<shops;j++){
                if(arr[j]<=arr1[i]){
                    possible++;
                }
                else{break;}
            }
            sb.append(possible+"\n");
        }

        System.out.println(sb);

    }
    
}
