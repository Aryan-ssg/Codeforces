import java.util.*;

public class Repetitions{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char[] arr=n.toCharArray();
        int l=arr.length;
        int ans=0;
        int box=1;
        for (int i=0;i<l-1;i++){
            if(arr[i]==arr[i+1]){
                box++;
                
        }
            else{
                if(ans<box){
                    ans=box;
                }
                box=1;

            }
        }
        if(ans<box){
            ans=box;
        }
        
        System.out.println(ans);





    }


}