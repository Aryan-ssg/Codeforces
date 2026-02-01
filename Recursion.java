import java.util.ArrayList;

public class Recursion {

    public static void main(String[] args) {
        
        String s="";
        
        String updated=removea(s,"",0);
        System.out.println(updated);

    }
    // 0 1 1 2 3 5 
    static String removea(String s,String s1,int ind){
        if(ind==s.length()){
            return s1;
        }
        if(s.charAt(ind)!='a'){
            s1=s1+s.charAt(ind);
        }
        return removea(s,s1,ind+1);
    }
    static void SubSequence(int index,int[] arr,ArrayList<Integer>lst){
        if(index>=arr.length){
            System.out.println(lst.toString());
            return;
                
        }
        lst.add(arr[index]);
        SubSequence(index+1,arr,lst);
        lst.removeLast();
        SubSequence(index+1,arr,lst);

        
        
    }
}