package basic;

import java.util.*;

public class BOJ9375 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                String a = sc.next();
                String b = sc.next();

                map.put(b, map.getOrDefault(b,0) + 1);
            }
            long ret = 1;
            for(int count : map.values()) {
                ret *= (count + 1);
            }
            ret--;

            System.out.println(ret);
        }
        sc.close();
    }
}
