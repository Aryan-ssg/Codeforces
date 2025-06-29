import java.util.HashMap;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);

        }
        boolean trig1 = false;

        int count = 0;
        for (int n : hm.values()) {
            if (n % 2 != 0) {
                count++;
                if (count == 2) {
                    System.out.println("NO SOLUTION");
                    trig1 = true;
                    break;

                }
            }
        }
        if (trig1 == false) {

            boolean trig = false;
            char mid = 'a';

            for (Character key : hm.keySet()) {
                if (hm.get(key) % 2 != 0) {
                    mid = key;
                    trig = true;
                    hm.put(key, hm.get(key) - 1);
                }
                for (int i = 0; i < hm.get(key) / 2; i++) {
                    sb1.append(key);
                    sb2.append(key);
                }

            }
            if (trig == false) {
                sb2.reverse();
                sb1.append(sb2);
            }
            if (trig == true) {
                sb2.reverse();
                sb1.append(mid).append(sb2);
            }
            System.out.println(sb1);
        }

    }
}
