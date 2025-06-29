import java.util.*;
public class _1850C {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        char[][] input=new char[8][8];
        int n=sc.nextInt();
        sc.nextLine();
        String s;

        for(int z=0;z<n;z++) {
            String ans="";
            for (int i = 0; i < 8; i++) {
                s = sc.nextLine();
                input[i] = s.toCharArray();
            }

            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(input[i][j]!='.'){
                      ans += input[i][j];
                    }
                }

            }
            System.out.println(ans);




        }


    }
}
