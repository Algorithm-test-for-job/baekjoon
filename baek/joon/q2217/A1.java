package baek.joon.q2217;

import java.util.*;

public class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int ROPE_COUNT = sc.nextInt();

        Integer[] arr = new Integer[ROPE_COUNT];

        for (int i = 0; i < ROPE_COUNT; i++) {
            arr[i] =sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;

        for (int i = 0; i < ROPE_COUNT; i++) {
            if(arr[i] * (i+1) > result) {
                result = arr[i] * (i + 1);
            }
        }


        System.out.println(result);
    }
}
