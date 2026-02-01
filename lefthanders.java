
import java.util.*;

public class lefthanders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        if (r > l) {
            int box = l;
            l = r;
            r = box;
        }

        int diff = l - r;
        if (diff <= a) {
            r = r + diff;
            a = a - diff;
            if (a == 1) {
                System.out.println(2 * r);
            } else {
                r = r + (int) Math.ceil(a / 2);
                System.out.println(2 * r);
            }

        }else{System.out.println(2*(r+a));}



    }

}
