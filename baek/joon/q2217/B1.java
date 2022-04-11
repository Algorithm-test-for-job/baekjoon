package baek.joon.q2217;

/*
    큰 로프부터 하다가 작아지면 break 하면 된다고 생각했는데 틀림. 
    생각해보니 그 이후에 다시 커질 수도 있음.
*/


import java.util.*;

public class B1 {

    static int N;
    static Integer[] inputs;
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        inputs = new Integer[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }

        // 정렬하기
        Arrays.sort(inputs, Collections.reverseOrder());

        int cnt = 1; // 로프 개수
        int min = inputs[0]; // 최소 값
        int prevAnswer = inputs[0];

        // 로프 하나씩 추가하면서 확인
        for (int i = 1; i < N; i++) {
            // 로프 걸리는 중량이 최소 이상이면 카운트하기
            if (min <= inputs[i]) {
                cnt++;
                prevAnswer = min * cnt;
                continue;
            }

            // 그렇지 않다면
            else {
                // 새로운 답이 이전 답보다 작다면 break;
                if (inputs[i] * (cnt + 1) < prevAnswer) break;

                // 그렇지 않다면 min 갱신하고 카운트하기
                else {
                    cnt++;
                    min = inputs[i];
                    prevAnswer = min * cnt;
                }
            }
        }

        System.out.println(prevAnswer);
    }

}
