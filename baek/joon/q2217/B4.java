package baek.joon.q2217;

/*
    B4:
    깔끔하게 다시 풀기.

    B3:
    B2 개선. int -> long. 근데 long으로 바꾸고 해봐도 틀리다고 나옴..
    B2 반례 3 1 1 4 : 답 4인데 3나옴
    전에 코드에서 min <= inputs[i] 무조건 갱신하는 거에서 잘못됐다.
    B1 계획에서 최솟값부터 비교할 때는 비교 안해도 무조건 컸지만 지금은 최댓값부터 비교하는 거기 때문에
    이 때도 비교해주어야 한다.



    B2:
    B1 개선. 큰 로프부터 해서 끝까지 비교하면서 answer 갱신.
    근데도 틀리네 뭐가 틀리지......

    B1:
    큰 로프부터 하다가 작아지면 break 하면 된다고 생각했는데 틀림. 
    생각해보니 그 이후에 다시 커질 수도 있음.
*/


import java.util.*;

public class B4 {

    static int N;
    static Long[] inputs;
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        inputs = new Long[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextLong();
        }

        // 정렬하기
        Arrays.sort(inputs, Collections.reverseOrder());

        long cnt = 1; // 로프 개수
        long answer = inputs[0];

        // 로프 하나씩 추가하면서 확인
        for (int i = 1; i < N; i++) {
            cnt++; // 카운트 추가
            long min = inputs[i];
            
            // 이전 정답보다 값이 더 작으면 갱신 
            if (min * cnt > answer) answer = min * cnt;
        }

        System.out.println(answer);
    }

}
