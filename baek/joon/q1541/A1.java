package baek.joon.q1541;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String QUESTION_STATEMENT = sc.nextLine();

        String[] minusArr = QUESTION_STATEMENT.split("-");

        int total = 0;

        for (int i = 0; i < minusArr.length; i++) {
            int sum = Arrays.stream(minusArr[i].split("\\+")).mapToInt(Integer::parseInt).sum();

            if(i == 0){
                total = sum;
            }else{
                total -= sum;
            }
        }

        System.out.println(total);
    }
}
