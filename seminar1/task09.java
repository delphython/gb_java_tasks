/*
 * Задан массив, например, nums = [1,7,3,6,5,6]. 
 * Написать программу, которая найдет индекс i
 * для этого массива такой, что сумма элементов
 * с индексами < i равна сумме элементов с индексами > i. 
 */

import java.util.Arrays;

public class task09 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int numsLenght = nums.length;

        for (int i = 1; i < numsLenght; ++i){
            int[] a = Arrays.copyOfRange(nums, 0, i);
            int[] b = Arrays.copyOfRange(nums, i+1, numsLenght);

            if (Arrays.stream(a).sum()  == Arrays.stream(b).sum()){
                System.out.printf("Искомый индекс i = %s", i);
            }
        }
    }
}
