import java.util.*;
public class bobandthebeanstalk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();
        int bspeed=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[minutes];
        for(int i=0;i<minutes;i++){
            arr[i]=sc.nextInt();
        }
        int bean=0;
        int bob=0;
        int time=0;
        for(int i=0;i<minutes;i++){
            bean+=arr[i];
            if(bean<=bob+bspeed){
                bob=bean;

            }else{
                bob+=bspeed;
            }
            time++;
        }
        if((bean-bob)%bspeed==0) {
            System.out.println(((bean - bob) / bspeed) + time);
        }
        else{
            System.out.println(((bean - bob) / bspeed) + time +1);
        }



    }
}
