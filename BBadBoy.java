
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BBadBoy {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            String input = br.readLine();
            String[] s = input.split(" ");
            int r=Integer.parseInt(s[0]);
            int c=Integer.parseInt(s[1]);
            int i=Integer.parseInt(s[2]);
            int j=Integer.parseInt(s[3]);

            int c1r=1;
            int c1c=1;

            int c2r=1;
            int c2c=c;
            
            int c3r=r;
            int c3c=c;
            
            int c4r=r;
            int c4c=1;

            int disc1=Math.abs(i-c1r)+Math.abs(j-c1c);
            int disc2=Math.abs(i-c2r)+Math.abs(j-c2c);
            int disc3=Math.abs(i-c3r)+Math.abs(j-c3c);
            int disc4=Math.abs(i-c4r)+Math.abs(j-c4c);

            int max=Math.max(Math.max(disc3, disc4),Math.max(disc1, disc2));
            int cx=0;
            int cy=0;
            int corner=0;
            if(disc1==max){
                cx=1;
                cy=1;
                corner=1;
            }else if(disc2==max){
                cx=1;
                cy=c;
                corner=2;
            }else if(disc3==max){
                cx=r;
                cy=c;
                corner=3;
            }else if(disc4==max){
                cx=r;
                cy=1;
                corner=4;
            }
            sb.append(cx+" "+cy+" ");

            int oppcorner=0;
            if(corner==1) oppcorner=3;
            else if(corner==2) oppcorner=4;
            else if(corner==3) oppcorner=1;
            else if(corner==4) oppcorner=2;
            

            if(oppcorner==1) sb.append(c1r+" "+c1c);

            else if(oppcorner==2) sb.append(c2r+" "+c2c);

            else if(oppcorner==3) sb.append(c3r+" "+c3c);

            else if(oppcorner==4) sb.append(c4r+" "+c4c);

            sb.append("\n");

            


            
            

        }
        System.out.println(sb.toString());
    }
}
