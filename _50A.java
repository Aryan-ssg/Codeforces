import java.util.Scanner;

public class _50A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int product=r*c;
        if(product%2==0){
            System.out.println(product/2);
        }else{
            System.out.println((product-1)/2);
        }
        



    }
}
