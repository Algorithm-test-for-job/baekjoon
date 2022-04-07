package baek.joon.q1946;

import java.util.*;


public class B2 {
    static int[] cap = new int[2];
    static int realN;
    static int[][] realArr;
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

                if (arr[i][0] == 1) cap[1] = arr[i][1];
                if (arr[i][1] == 1) cap[0] = arr[i][0];
            }
            realN = 0;
            realArr = new int[N][2];
            for (int i = 0; i < N; i++) {
                if (arr[i][0] < cap[0] || arr[i][1] < cap[1]) {
                    realArr[realN][0] = arr[i][0];
                    realArr[realN][1] = arr[i][1];
                    realN++;
                }
            }

            for (int i = 0; i < realN; i++) {
                if (compare(realArr, i)) answer[answerIdx]++;
            }
            
            answerIdx++;
        }

        for (int val : answer) {
            System.out.println(val);
        }
    }
    
    // 모든 상대방과 비교해서 둘다 떨어지는 경우 있으면 false
    public static boolean compare(int[][] arr, int targetIdx) {
        for (int i = 0; i < realN; i++) {
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
