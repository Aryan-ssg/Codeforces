import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int len=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int z=0;
        int n=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='z'){
                z++;
            }
            else if(s.charAt(i)=='n'){
                n++;
            }
        }
        for(int i=0;i<n;i++){
            sb.append(1+" ");
        }
        for(int i=0;i<z;i++){
            sb.append(0+" ");
        }
        System.out.println(sb);

    }
}
