package 브론즈;

import java.io.*;
import java.util.*;


public class BOJ2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] cnt = new int[104];
        int ret = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = A; j < B; j++) {
                cnt[j]++;
            }
        }
        for (int j = 1; j < 100; j++) {
            if (cnt[j] > 0) {
                if (cnt[j] == 1) ret += a;
                else if (cnt[j] == 2) ret += b * 2;
                else if (cnt[j] == 3) ret += c * 3;

            }
        }
        System.out.println(ret);
    }
}
