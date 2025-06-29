import java.util.*;
public class _231A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int view=0;
        int problem=0;
        for(int i=0;i<n;i++){
            view=0;
            for(int j=0;j<3;j++) {
                if (sc.nextInt() == 1) {
                    view++;
                }
            }
            if(view>=2){
                problem++;
            }
        }
        System.out.println(problem);
    }
}