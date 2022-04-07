package baek.joon.q1946;
import java.util.*;

public class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TEST_CASE_COUNT = sc.nextInt();

        for (int i = 0; i < TEST_CASE_COUNT; i++) {

            final int APPLICANTS_COUNT = sc.nextInt();

            int[] applicantsArr = new int [APPLICANTS_COUNT];

            for (int j = 0; j < APPLICANTS_COUNT; j++) {
                int resume = sc.nextInt() - 1;
                int interview = sc.nextInt();

                applicantsArr[resume] = interview;
            }

            int resultCount = 1;
            int highRank = applicantsArr[0];


            //인터뷰탐색
            for (int k = 1; k < APPLICANTS_COUNT; k++) {

                if (highRank > applicantsArr[k]) {
                    highRank = applicantsArr[k];
                    resultCount++;
                }
            }
            System.out.println(resultCount);
        }

    }
}
