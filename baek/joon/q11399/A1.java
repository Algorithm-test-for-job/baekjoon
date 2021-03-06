package baek.joon.q11399;

import java.util.*;

public class A1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String waitingTimeStr = scanner.nextLine();

        int[] waitingTimeArr = Arrays.stream(Arrays.stream(waitingTimeStr.split(" "))
                .mapToInt(Integer::parseInt).toArray()).sorted().toArray();

        int totalTime = 0;

        for(int waitingTime:waitingTimeArr){

            totalTime += waitingTime * numberOfPeople;

            numberOfPeople--;
        }

        System.out.println(totalTime);


    }
}
