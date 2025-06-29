import java.util.*;

public class _105767A {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int tc = sc.nextInt();
//        ArrayList<Integer> ls = new ArrayList<>();
//        for(int z=0;z<tc;z++) {
//            ls.add(2);
//            int n = sc.nextInt();
//            for (int i = 3; i <= 2 * n; i++) {
//               int count = 0;
//                for (int j = 0; j < ls.size(); j++) {
//                    if (i % ls.get(j) == 0) {
//                        break;
//                    } else {
//                        count++;
//                    }
//                }
//
//                if (count == ls.size()) {
//                    ls.add(i);
//                }
//            }
//            for(int i=0;i<ls.size();i++){
//                System.out.print(ls.get(i)+" ");
//            }
//            System.out.println();
//            ls.clear();
//        }
//
//
//
//
        Scanner sc=new Scanner(System.in);
        int tc = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int z=0;z<tc;z++){
            ls.add(2);
            int n = sc.nextInt();
            for(int i=3;i<2*n;i++){
                int count=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        break;
                    }
                    count++;
                }
                if(count==i-2){
                    ls.add(i);
                }
            }
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i)+" ");
            }
            System.out.println();
            ls.clear();




        }
















    }
}
