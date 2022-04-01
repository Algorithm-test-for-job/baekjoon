package baek.joon.q12904;

import java.util.*;

/*
T에서 끝글자 제거하면서 순서 거슬러 올라가기
*/

/*
다른 아이디어: T와 S의 B 개수 차이에서 몇번 뒤집었는지 알 수 있다.
*/

public class B2 {
    static String S, T;
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        T = sc.next();
        sc.close();

        while (S.length() != T.length()) {
            char ch = T.charAt(T.length() - 1);
            if (ch == 'A') {
                T = T.substring(0, T.length() - 1);
            }
            else if (ch == 'B') {
                T = T.substring(0, T.length() - 1);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < T.length(); i++) {
                    sb.append(T.charAt(T.length() - 1 - i));
                }
                T = sb.toString();
            }
        }
        
        if (S.equals(T)) System.out.println(1);
        else System.out.println(0);
        
    }
}
