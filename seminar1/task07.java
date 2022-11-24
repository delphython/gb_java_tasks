/*
 * Реализовать функцию возведения числа а в степень b.
 * a, b из Z. Сводя количество выполняемых действий к минимуму.
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 */

import java.io.Console;

public class task07 {
    public static Double exponentiation(int value, int powValue){
        return Math.pow(value, powValue);
    }

    public static void main(String[] args) {
        Console console = System.console();

        int a = Integer.parseInt(console.readLine("a = "));
        int b = Integer.parseInt(console.readLine("b = "));

        console.printf("exponentiation = %s", Double.toString(exponentiation(a, b)));
    }
}
