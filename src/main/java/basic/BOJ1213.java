package basic;

import java.util.*;
public class BOJ1213 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int[] count = new int[26];
        for(char c : input.toCharArray()){
            count[c - 'A']++;
        }

        int oddCount = 0;
        char oddChar = 0;
        for(int i = 0; i < 26; i++){
            if(count[i]%2 == 1){
                oddCount++;
                oddChar = (char)('A' + i);
            }
        }
        if(oddCount > 1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder leftHalf = new StringBuilder();
        for(int i = 0; i < 26; i++){
            for(int j = 0 ; j <count [i]/2; j++){
                leftHalf.append((char)('A' + i));
            }
        }
        StringBuilder result = new StringBuilder(leftHalf);
        if(oddCount == 1) result.append(oddChar);
        result.append(leftHalf.reverse());

        System.out.println(result);

    }
}
