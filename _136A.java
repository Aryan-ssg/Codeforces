import java.util.ArrayList;
import java.util.Scanner;

public class _136A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());

        }
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                if(arr.get(j)==i+1){
                    System.out.print(j+1 +" ");
                    break;


                }



            }
            
        }






        
    }
    
}
