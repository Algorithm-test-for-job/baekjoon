package baek.joon.q1213;

import java.util.*;

public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        final int SIZE = input.length();

        int[] alphaArr = new int[26];

        for (int i = 0; i < SIZE; i++) {
            alphaArr[input.charAt(i) - 'A']++;
        }

        int cnt = 0;
        int center = 0;

        for(int i=0;i<26;i++) {
            if (alphaArr[i] % 2 != 0) {
                center = i;
                cnt++;
            }
        }

        if(cnt>1 || (cnt==1 && SIZE%2==0)) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        StringBuffer result = new StringBuffer();

        for(int i=0;i<26;i++) {
            for (int j = 0; j < alphaArr[i] / 2; j++) {
                result.append((char) (i + 'A'));
            }
        }

        StringBuffer tmpStr = new StringBuffer(result.toString());

        if (cnt == 1) {
            result.append((char) (center + 'A'));
        }

        System.out.println(result.toString()+tmpStr.reverse());
    }
}

