/*
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class task01 {
    public static LinkedList<Integer> returnReversedLinkedList(LinkedList<Integer> inputList) {
        Collections.reverse(inputList);

        return inputList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(10, 20, 30));

        LinkedList<Integer> reversedList = returnReversedLinkedList(inputList);

        System.out.println(reversedList.toString());
    }
}
