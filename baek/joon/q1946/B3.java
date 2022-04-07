package baek.joon.q1946;

import java.util.*;

// comparator로 첫번째 조건 먼저 정렬한 뒤에 비교

public class B3 {

    static Prsn[] arr;
    static int T, N, answersIdx;
    static int[] answers;


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        answers = new int[T];
        
        answersIdx = 0;
        while (T-- > 0) {
            N = sc.nextInt();
            arr = new Prsn[N];
            for (int i = 0; i <arr.length; i++) {
                arr[i] = new Prsn();
                arr[i].score1 = sc.nextInt();
                arr[i].score2 = sc.nextInt();
            }

            // 첫번째 점수 기준으로 낮은 등수부터 정렬
            Arrays.sort(arr, new Comparator<Prsn>() {
                public int compare(Prsn p1, Prsn p2) {
                    return p2.score1 - p1.score1;
                }
            }); 

            // 낮은 등수부터 비교하는데 첫번째 점수에서 진 애들과 비교
            for (int i = 0; i < arr.length; i++) {
                boolean isAdded = true;
                
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].score2 > arr[j].score2) {
                        isAdded = false;
                        break;
                    }
                }
                if (isAdded) answers[answersIdx]++;
            }
            
            answersIdx++;
        }

        // 정답 출력
        for (int answer : answers) {
            System.out.println(answer);
        }


    }

    public static class Prsn {
        int score1;
        int score2;
    }
}
