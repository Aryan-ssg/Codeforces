import java.util.*;

public class _236A{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
    //     Set<Character> set=new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         set.add(arr[i]);
    //     }
    //     if(set.size()%2 ==1){
    //         System.out.println("IGNORE HIM!");
    //     }
    //     else if(set.size()%2==0){
    //         System.out.println("CHAT WITH HER!");
    //     }
        int dischar=0;

        for(int i=0;i<arr.length;i++){
            dischar++;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    dischar--;
                    break;
                }
            }
        }
        if(dischar%2 ==0){
            System.out.println("CHAT WITH HER!");
        }
        else if(dischar%2==1){
            System.out.println("IGNORE HIM!");
        }




    }
}