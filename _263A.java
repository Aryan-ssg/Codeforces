import java.util.Scanner;

public class _263A {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=0;
        int c=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(sc.nextInt()==1){
                    c=j;
                    r=i;
                    break;
                }
            }
        }
        System.out.println(Math.abs(r-2)+Math.abs(c-2));
        

    }
}
