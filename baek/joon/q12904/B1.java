package baek.joon.q12904;

import java.util.*;

/*
시간초과
*/

/*
두 연산 모두 글자수가 증가한다. 그래서 모든 경우의 수 생각해볼 수 있다. 
글자수 차이 n개 일 때 경우의 수는 2^n개
2^n개 2로 나누면서 방법 순서 정할 수 있다.
*/


public class B1 {
    static String S, T;
    static int N, caseTot;
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        T = sc.next();
        sc.close();

        // 글자수 차이
        N = T.length() - S.length(); // 글자수 차이
        caseTot = (int) Math.pow(2, N); // 총 경우의 수

        // 경우의 수 2^n개에 대해 check
        boolean isPossible = false;   
        for (int i = 0; i < caseTot; i++) {
            if (check(i)) {
                isPossible = true;
                break;
            }
        }

        if (isPossible) System.out.println(1);
        else System.out.println(0);
        
        
    }

    // 해당 케이스에 대해 글자 수 같은지 확인
    public static boolean check(int caseNum) {
        String str = S; 
        for (int i = 0; i < N; i++) {
            int wayNum = caseNum % 2; 
            str = addLetter(wayNum, str);
            caseNum /= 2;           
        }
        System.out.println(str);
        if (str.equals(T)) return true;
        return false;
    }

    // S에 글자 추가하기
    public static String addLetter(int wayNum, String str) {
        if (wayNum == 0) {
            str = str + 'A';    
        } 
        else if (wayNum == 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            sb.append('B');
            str = sb.toString();
        }

        return str;
    }
}
