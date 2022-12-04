/*
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее
 * из этого списка
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class task03 {
    public static void main(String[] args) {
        ArrayList<Integer> sourceList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));

        Collections.sort(sourceList);

        System.out.printf("Минимальное значение = %d\n", sourceList.get(0));
        System.out.printf("Максимальное значение = %d\n", sourceList.get(sourceList.size()-1));

        Double average = sourceList.stream().mapToInt(val -> val).average().orElse(0.0);

        System.out.printf("Среднее значение = %f", average);
    }
}
