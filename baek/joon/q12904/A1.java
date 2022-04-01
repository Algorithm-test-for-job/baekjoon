package baek.joon.q12904;
import java.util.*;

public class A1 {

    static String dropB(String word) {


        String deletedWord = word.substring(0, word.length() - 1);

        StringBuffer newWord = new StringBuffer(deletedWord);

        return newWord.reverse().toString();
    }

    static String dropA(String word) {

        return word.substring(0,word.length()-1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String defaultStr = scanner.nextLine();
        String targetStr = scanner.nextLine();


        while (targetStr.length() > defaultStr.length()) {

            String lastWord = targetStr.substring(targetStr.length() - 1);

            if (lastWord.equals("A")) {
                targetStr = dropA(targetStr);
            } else if (lastWord.equals("B")) {
                targetStr = dropB(targetStr);
            } else {
                break;
            }
        }


        if (targetStr.equals(defaultStr)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}