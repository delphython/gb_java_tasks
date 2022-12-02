/*
 * Реализуйте алгоритм сортировки пузырьком 
 * числового массива, результат после каждой
 * итерации запишите в лог-файл
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class task02 {
    public static int[] bubbleSortArray(int[] inputArray) {
        int temp;
        for (int i=0; i<inputArray.length-1; i++)
        {
            for (int j=0; j<inputArray.length-i-1; j++)
            {
                if (inputArray[j+1] < inputArray[j])
                {
                    temp = inputArray[j+1];
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = temp;
                }
                System.err.println(Arrays.toString(inputArray));
            }
        }
        return inputArray;
    }
    public static void main(String[] args) throws FileNotFoundException {
        int[] inputArray = new int[] {1, 23, 45, 5, 11};

        System.setErr(new PrintStream(new File("seminar2/task02_log.txt")));

        int[] sortedBubleArray = bubbleSortArray(inputArray);

        System.out.println(Arrays.toString(sortedBubleArray));
    }
}
