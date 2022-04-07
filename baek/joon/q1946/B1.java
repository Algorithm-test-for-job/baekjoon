package baek.joon.q1946;

import java.util.*;

/*
    시간초과
*/

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];
        int answerIdx = 0;
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                if (compare(arr, i)) answer[answerIdx]++;
            }
            
            answerIdx++;
        }

        for (int val : answer) {
            System.out.println(val);
        }
    }
    
    // 모든 상대방과 비교해서 둘다 떨어지는 경우 있으면 false
    public static boolean compare(int[][] arr, int targetIdx) {

        for (int i = 0; i < arr.length; i++) {
            if (i == targetIdx) continue;
            if (arr[targetIdx][0] > arr[i][0]) {
                if (arr[targetIdx][1] > arr[i][1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
