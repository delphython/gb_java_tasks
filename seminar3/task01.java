/*
 * Реализовать алгоритм сортировки слиянием
 */

import java.util.Arrays;

public class task01 {
    private static void MergeSortArray(int[] inputArray, int firstElement, int lastElement) {
        if (lastElement <= firstElement)
            return;
        int middleElement = firstElement + (lastElement - firstElement) / 2;
        
        MergeSortArray(inputArray, firstElement, middleElement);
        MergeSortArray(inputArray, middleElement + 1, lastElement);

        int[] tmpArray = Arrays.copyOf(inputArray, inputArray.length);
    
        for (int k = firstElement; k <= lastElement; k++)
        tmpArray[k] = inputArray[k];
    
        int i = firstElement, j = middleElement + 1;
        for (int k = firstElement; k <= lastElement; ++k) {
            if (i > middleElement) {
                inputArray[k] = tmpArray[j];
                ++j;
            } 
            else if (j > lastElement) {
                inputArray[k] = tmpArray[i];
                ++i;
            } 
            else if (tmpArray[j] < tmpArray[i]) {
                inputArray[k] = tmpArray[j];
                ++j;
            } 
            else {
                inputArray[k] = tmpArray[i];
                ++i;
            }
        }
    }
    public static void main(String[] args) {
        int[] inputArray = {20002, 34, 56, 1, 574, 688, 2, 55, 101};

        MergeSortArray(inputArray, 0, inputArray.length-1);

        System.out.println(Arrays.toString(inputArray));
    }
}
