
import java.util.*;

public class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();
       
       String s=sc.nextLine();
       int sf=0;
       int fs=0;
       for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='S' && s.charAt(i+1)=='F'){
                sf++;
            }
            if(s.charAt(i)=='F' && s.charAt(i+1)=='S'){
                fs++;
            }
       }
       if(sf>fs){
        System.out.println("yes");
       }else{System.out.println("no");}


       



    }

}
