import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int c5=0;
        
        int div=5;
        
        while(div<=n){
            c5+=n/div;
            div*=5;
        }
        System.out.println(c5);











        // if(n<5){
        //     System.out.println(0);
        // }
        // else{
        //     for(int i=5;i<=n;i+=5){
                
        //         int j=i;
        //         while(j%5==0){
        //             j/=5;
        //             c5++;
        //         }
                
                
        //     }
        //     System.out.println(c5);



        // }
        










    }
    
}
