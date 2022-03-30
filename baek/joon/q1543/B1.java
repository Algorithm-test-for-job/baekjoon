package baek.joon.q1543;

import java.util.*;

// 인호 풀이
public class B1 {

    static int answer = 0;
    static String str;
    static String keyword;
    static char[] strArr;
    static char[] keywordArr;
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        keyword = sc.nextLine();
        strArr = str.toCharArray();
        keywordArr = keyword.toCharArray();

        // 시작 문자열 하나씩 증가시키면서 키워드 문자열과 비교
        int startIdx = 0;
        while (startIdx < str.length()) {
            // 문자열 일치하면 인덱스 증가, 정답 카운트
            if (search(startIdx)) {
                startIdx += keyword.length();
                answer++;
            } 
            // 문자열 일치하지않으면 인덱스 1증가
            else if (!search(startIdx)) {
                startIdx++;
            }
        }

        // 정답 출력
        System.out.println(answer);

        // 스캐너 close
        sc.close();
    }

    // keyword 있는지 체크하기 메소드
    public static boolean search(int startIdx) {
        // strArr 길이 오버플로우시 리턴
        if (startIdx + keywordArr.length > strArr.length) return false;
        
        // 한글자씩 동일한지 체크
        for (int i = 0; i < keywordArr.length; i++) {
            if (keywordArr[i] != strArr[startIdx + i]) return false;
        }        

        return true;
    }
}
