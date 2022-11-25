/*
 * Вычислить n-ое треугольное число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */

import java.io.Console;

public class task11 {
    public static Integer triangleNums(int n){
        if(n == 1)
            return 1;
        else
            return(n + triangleNums(n - 1));
    }
    public static void main(String[] args) {
        Console console = System.console();
        
        String n = console.readLine("n = ");

        console.printf("Треугольное число =  %d", triangleNums(Integer.parseInt(n)));
    }
}
