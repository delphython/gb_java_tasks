/*
 * На вход некоторому исполнителю подаётся два числа (a, b).
 * У исполнителя есть две команды
 * - команда 1 (к1): увеличить в с раза, а умножается на c
 * - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
 * Написать программу, которая выдаёт набор команд, позволяющий 
 * число a превратить в число b или сообщить, что это невозможно
 * Пример 1: а = 1, b = 7, c = 1, d = 3
 * ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 
 * или к1, к1, к2, к1. 
 * Пример 2: а = 11, b = 7, c = 2, d = 1
 * ответ: “”.
 */

import java.io.Console;
import java.util.ArrayList;

public class task08 {
    public static void main(String[] args) {
        Console console = System.console();
        ArrayList<String> resultList = new ArrayList<String>();

        int a = Integer.parseInt(console.readLine("a = "));
        int b = Integer.parseInt(console.readLine("b = "));
        int c = Integer.parseInt(console.readLine("c = "));
        int d = Integer.parseInt(console.readLine("d = "));

        while (a < b){
            if (a * c == a) {
                a = a + d;
                resultList.add("k2");
            }
            else if (a * c < b){
                a = a * c;
                resultList.add("k1");
            }
            else {
                a = a + d;
                resultList.add("k2");
            }
        }

        if (a == b){
            console.printf(String.join(", ", resultList));
        }
        else {
            console.printf("");
        }
    }
}
