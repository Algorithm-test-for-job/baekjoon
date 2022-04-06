package baek.joon.q1541;

import java.util.*;

public class B1 {
    public static void main(String[] args) {

        int answer = 0;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String numStr = "";
        boolean isMinus = false;
        for (int i = 0; i < input.length(); i++) {
            
            char ch = input.charAt(i);

            // 숫자면
            if (ch >= '0' && ch <= '9') {
                numStr += ch;
                if (i != input.length() - 1) continue;
           }

           // 부호만나거나 마지막 숫자면 계산
            int num = Integer.parseInt(numStr);
            numStr = "";

            if (isMinus) answer -= num;
            else answer += num;

            // 마이너스 만나면 다음 수부터 빼기
            if (ch == '-') {
                isMinus = true;    
            }

        }
        System.out.println(answer);
    }
}
