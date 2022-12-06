/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * - enqueue() - помещает элемент в конец очереди,
 * - dequeue() - возвращает первый элемент из очереди и удаляет его,
 * - first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class task02 {
    public static LinkedList<Integer> enqueue(LinkedList<Integer> inputList, int element) {
        inputList.addLast(element);
        return inputList;
    }

    public static Integer dequeue(LinkedList<Integer> inputList) {
        inputList.removeFirst();
        return inputList.getFirst();
    }
    public static Integer first(LinkedList<Integer> inputList) {
        return inputList.getFirst();
    }
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(10, 20, 30));

        System.out.println(enqueue(inputList, 40));
        System.out.println(dequeue(inputList));
        System.out.println(first(inputList));
    }
}
