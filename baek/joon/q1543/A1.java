package back.joon.q1543;
import java.util.*;

//찬우 풀이
public class A1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String fullText = scanner.nextLine();
        final String TARGET = scanner.nextLine();
        final int TARGET_LENGTH =TARGET.length();

        int count = 0;

        for(int i = 0 ; i < fullText.length() ; i++){

            if(fullText.length() - i < TARGET_LENGTH){
                continue;
            }

            String searchRange = fullText.substring(i, i + TARGET_LENGTH);

            if(searchRange.equals(TARGET)){
                count++;
                i += TARGET_LENGTH - 1;
            }

        }

        System.out.println(count);

    }
}
