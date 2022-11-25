/*
 * Вывести все простые числа от 1 до 1000
 */

public class task12 {
    public static boolean IsSimple(int value)
    {
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int n = 2; n <= 1000; ++n) {
            System.out.print(IsSimple(n) ? (n + " ") : "");
        }
    }
}
