/*
 * Дан массив nums = [3,2,2,3] и число val = 3. 
 * Если в массиве есть числа, равные заданному,
 * нужно перенести эти элементы в конец массива. 
 * Таким образом, первые несколько (или все)
 * элементов массива должны быть отличны от
 * заданного, а остальные - равны ему.
 */

import java.util.ArrayList;
import java.util.Collections;

public class task04 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 1, 2, 3, 4, 5, 3};
        int numsLenght = nums.length;

        ArrayList<Integer> targetList = new ArrayList<>((Collections.nCopies(numsLenght, 0)));
        
        int val = 3, countVal = 0, countNotVal = 0;

        for(int i = 0; i < numsLenght; ++i) {
            if (nums[i] != val) {
                targetList.set(countNotVal, nums[i]);
                ++countNotVal;
            }
            else {
                targetList.set(numsLenght-countVal-1, nums[i]);
                ++countVal;
            }
        }

        System.out.printf(targetList.toString());
    }
}
