package baek.joon.q11047;

import java.util.*;

/*
각 가치들에 대해서 큰 가치는 작은 가치의 배수이므로 큰 가치에서부터 그리디로 개수 구하기
*/

public class B1 {
    static int N, K;
    static int answer, remainingK;
    static int[] valueArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        valueArr = new int[N]; // 주어진 가치 목록 저장
        for (int i = 0; i < N; i++) {
            valueArr[i] = sc.nextInt();
        }

        answer = 0;
        remainingK = K;
        for (int i = 0; i< N; i++) {
            if (remainingK == 0) break;
            int selectedValue = valueArr[valueArr.length - 1 - i]; // 가장 큰 가치부터 하나씩 꺼내서
            while (selectedValue <= remainingK) { // 남아있는 금액이 가치 값 이하가 될때까지
                answer++;
                remainingK -= selectedValue;
            }
        }

        System.out.println(answer);
    }
}
