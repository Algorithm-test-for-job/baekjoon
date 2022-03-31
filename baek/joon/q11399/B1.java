package baek.joon.q11399;

import java.util.*;

public class B1 {
    static int[] arr;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            answer += arr[i] * (N - i);
        }
        System.out.println(answer);
    }
}
