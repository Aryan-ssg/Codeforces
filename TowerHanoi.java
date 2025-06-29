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
        TOH(3, 'A', 'B', 'C');
    }
}
