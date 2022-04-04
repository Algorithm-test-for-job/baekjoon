package baek.joon.q11047;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int COIN_AMOUNT = scanner.nextInt();
        final int TARGET_VALUE = scanner.nextInt();

        ArrayList<Integer> coins = new ArrayList<>();
        int remainValue = TARGET_VALUE;
        int count=0;

        for(int i = 0 ; i < COIN_AMOUNT ; i++){
            coins.add(scanner.nextInt());
        }

        for (int i = COIN_AMOUNT-1 ; i > 0 ; i-- ){

            if (coins.get(i) > remainValue) {
                continue;
            }

            count += remainValue / coins.get(i);
            remainValue = remainValue % coins.get(i);
        }

        System.out.println(count);

    }
}
