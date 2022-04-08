package baek.joon.q1213;

import java.util.*;

/*
B1에서 홀수든 짝수든 사전식으로 나열하기
*/
public class B2 {
    static String inputStr;
    static char[] inputStrArr;
    static Map<Character, Integer> cntMap;
    static StringBuffer outputSb;
    static char[] outputStrArr;
    static boolean isNoAnswer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputStr = sc.nextLine();
        inputStrArr = new char[inputStr.length()];

        // 글자 하나하나 배열에 담기
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            inputStrArr[i] = ch;
            
        }

        // 글자 배열 오름차순 정렬하기
        Arrays.sort(inputStrArr);

        // 정답 글자 배열 만들기
        outputStrArr = new char[inputStr.length()];
        
        // 글자 종류별로 분류하기
        cntMap = new HashMap<>();
        char ctChar = inputStrArr[0]; // 기준문자
        int cnt = 1;
        boolean meetOdd = false;
        int addIdx = 0;
        if (inputStrArr.length == 1) {
            isNoAnswer = true;
            System.out.println(inputStr);
        }
        for (int i = 1; i < inputStrArr.length; i++) {
            char selectedChar = inputStrArr[i]; 
            boolean mustAddToMap = true;
            // 같은 문자일 때 수 증가
            if (ctChar == selectedChar) {
                cnt++;

                if (i != inputStrArr.length - 1) {
                    mustAddToMap = false;
                }
            } 
            
            // 맵에 더해야 할 때
            if (mustAddToMap || ctChar != selectedChar){
                // 개수가 홀수인 경우
                if (cnt % 2 == 1) {
                    if (!meetOdd) { // 홀수 처음 등장이면
                        meetOdd = true;
                        // 중앙에 문자 배치하기
                        int midIdx = inputStrArr.length / 2;
                        outputStrArr[midIdx] = ctChar;

                    } else { // 이미 홀수 등장한 적 있으면 팰린드롬 불가
                        System.out.println("I'm Sorry Hansoo");
                        isNoAnswer = true;
                        break;
                    }
                }
                
                // 글자 배치 (홀수일 경우 가운데 제외)
                for (int ii = 0; ii < cnt / 2; ii++) {
                    outputStrArr[ii + addIdx] = outputStrArr[outputStrArr.length - 1 - ii - addIdx] = ctChar;
                }
                addIdx += cnt / 2;   
            }

            // 다른 문자 만났을 때
            if (ctChar != selectedChar) {
                // 다른 문자 기준으로 다시 시작
                ctChar = selectedChar;
                cnt = 0;
                i--;
            }
        }

        // 맵에서 키 모은 배열 뽑아서 그 배열 정렬한 다음에 순서대로 갯수 꺼내서 그거에 맞춰서 결과문자열 양옆에 넣기

        // 결과값 출력하기
        outputSb = new StringBuffer();
        if (!isNoAnswer) {
            for (char ch : outputStrArr) {
                outputSb.append(ch);
            }
            System.out.println(outputSb.toString());
        }
    }
}
