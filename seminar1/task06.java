/*
 * Во фразе "Добро пожаловать на курс по Java"
 * переставить слова в обратном порядке.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task06 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";

        String[] splitPhraseArray = phrase.split(" ");

        ArrayList<String> splitPhraseArrayList = new ArrayList<String>(
            Arrays.asList(splitPhraseArray)
        );

        Collections.reverse(splitPhraseArrayList);

        System.out.printf(
            String.join(" ", splitPhraseArrayList)
        );
    }
}
