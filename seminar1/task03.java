/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное количество подряд идущих 1.
 */

public class task03 {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int counter_max = 0, counter = 0;
        
        for(int i = 0; i < binaryArray.length; ++i) {
            if(binaryArray[i] == 1)
                ++counter;
            else
                counter = 0;
                
            if(counter_max < counter) {
                counter_max = counter;
            }
        }

        System.out.printf("Максимальное количество 1 = %s", counter_max);
    }
}
