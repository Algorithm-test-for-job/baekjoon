package baek.joon.q1449;

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;

        for (int i = 0; i < N;) {
            answer++;
            int cap = arr[i] + L - 1;
            if(i == N - 1) break;
            while (arr[++i] <= cap ) {
                if(i == N - 1) {
                    answer--;
                    break;
                };
            }
        }

        System.out.println(answer);

    }
}
