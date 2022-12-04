/*
 * Пусть дан произвольный список целых чисел,
 * удалить из него четные числа
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class task02 {
    public static void main(String[] args) {
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Set<Integer> targetSet = new HashSet<>(sourceList);

        targetSet.removeIf(x -> (x % 2 == 0));

        System.out.println(targetSet.toString());
    }
}
