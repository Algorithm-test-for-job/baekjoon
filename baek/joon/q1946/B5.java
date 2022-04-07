package baek.joon.q1946;

import java.util.*;
import java.io.*;

// B4에서 찬우꺼 보고 변경하기

public class B5 {

    static Prsn[] arr;
    static int T, N, answersIdx;
    static int[] answers;


    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());
        answers = new int[T];
        
        answersIdx = 0;
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            arr = new Prsn[N];
            for (int i = 0; i <arr.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i] = new Prsn();
                arr[i].score1 = Integer.parseInt(st.nextToken());
                arr[i].score2 = Integer.parseInt(st.nextToken());
            }

            // 첫번째 점수 기준으로 높은 등수부터 정렬
            Arrays.sort(arr, new Comparator<Prsn>() {
                public int compare(Prsn p1, Prsn p2) {
                    return p1.score1 - p2.score1;
                }
            }); 
            int cap = arr[0].score2;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    answers[answersIdx]++;
                    continue;
                }

                if (cap > arr[i].score2) {
                    answers[answersIdx]++;
                    cap = arr[i].score2;
                    continue;
                }
            }
            
            answersIdx++;
        }

        // 정답 출력
        for (int answer : answers) {
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static class Prsn {
        int score1;
        int score2;
    }
}
