import java.util.*;
public class _71A {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            char[] arr=s.toCharArray();
            if(arr.length<=10){
                System.out.println(s);
            }else{
                System.out.print(arr[0]);
                System.out.print(arr.length-2);
                System.out.print(arr[arr.length-1]);
                System.out.println();
            }




        }


    }
}
