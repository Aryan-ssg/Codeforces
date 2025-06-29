public class Factorial {

    static int pow(int a, int b) {
        if(b==1){
            return a;
        }
        int ans=a*pow(a,b-1);
        return ans;




    }

    public static void main(String[] args) {
        System.out.println(pow(3,3));

    }

}