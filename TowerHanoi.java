public class TowerHanoi {

    static void TOH(int n, char source, char mid, char destination) {
        if (n == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        TOH(n - 1, source, destination, mid);
        System.out.println(source + " " + destination);
        TOH(n - 1, mid, source, destination);
    }

    public static void main(String[] args) {
        // TOH(3, 'A', 'B', 'C');
        towerOfHanoi(3, 'A', 'B', 'C');

    }


    public static void towerOfHanoi(int n , char src,char helper,char des){

        if(n==1){
            System.out.println("Moved "+n+" from "+src+" to "+des);
            return;
        }

        towerOfHanoi(n-1, src, des, helper);
        System.out.println("Moved "+n+" from "+src+" to "+des);
        towerOfHanoi(n-1, helper, src, des);

    }
}
