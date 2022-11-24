/*
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */

import java.io.Console;

public class task01 {
    public static void main(String[] args) {
        Console console = System.console();
        
        String userName = console.readLine("Enter your name: ");

        console.printf("Hello, %s!", userName);
    }
}
