import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2121A {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int q = 0; q < tc; q++) {
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            char[] arr=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i);

            }
            // String a=s.subString(0,i);
            // String c=s.subString(,s.length()-1);
            // String b=s.subString(i+1,);
            boolean trig=false;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    String a=s.substring(0,j);
                    String b=s.substring(j+1,n-i-2);
                    
                    String c=s.substring(n-i-1,n-1);
                    
                    if(b.length()<=a.length()+c.length()){
                        if((a+c).contains(b)){
                            trig=true;
                            sb.append("YES\n");
                            break;

                        }

                    }



                }
                if(trig==true){
                    break;
                }
            }
            if(trig==false){
                sb.append("NO\n");

            }







        }
        System.out.println(sb);

    }
}
