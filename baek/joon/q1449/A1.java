package baek.joon.q1449;
import java.util.*;

public class A1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final int HOLES = sc.nextInt();
        final int TAPE_LENGTH = sc.nextInt();

        double[] holeDistanceArr = new double[HOLES];

        int tapeCount = 1;

        for(int i = 0 ; i < HOLES ; i++){
            holeDistanceArr[i] = sc.nextDouble();
        }

        Arrays.sort(holeDistanceArr);

        double endPosition = holeDistanceArr[0] - 0.5 + TAPE_LENGTH;

        for(int i = 1 ; i < holeDistanceArr.length ; i++){
            if(endPosition < holeDistanceArr[i] + 0.5){
                endPosition = holeDistanceArr[i] - 0.5 + TAPE_LENGTH;
                tapeCount++;
            }
        }

        System.out.println(tapeCount);

    }
}
