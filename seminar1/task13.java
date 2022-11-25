/*
 * Реализовать простой калькулятор + - / * 
 */

import java.io.Console;

public class task13 {
    public static void main(String[] args) {
        String[] nums = new String[2];
        Console console = System.console();

        for (int i = 0; i < 2; ++i)
        {
            nums[i] = console.readLine("Введите %d-е число: ", i + 1);
        }
        String mathOperation = console.readLine("Введите математическое действие,\nгде + сложение,\n- вычитание,\n* умножение,\n/ деление: ");

        if (nums[0] != null && nums[1] != null && mathOperation != null)
        {
            try 
            {
                double inputFirstNumber = Double.parseDouble(nums[0]);
                double inputSecondNumber = Double.parseDouble(nums[1]);
                char oper = mathOperation.charAt(0);
                
                switch (oper)
                    {
                        case '+':
                            console.printf("%f + %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber + inputSecondNumber);
                            break;
                        case '-':
                            console.printf("%f - %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber - inputSecondNumber);
                            break;
                        case '*':
                            console.printf("%f * %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber * inputSecondNumber);
                            break;
                        case '/':
                            console.printf("%f / %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber / inputSecondNumber);
                            break;
                        default: console.printf("Введен неизвестный символ математической операции");
                            break;
                    }
            }
            catch (Exception e)
            {
                console.printf("Что-то здесь не так: %s", e);
            }
        }
    }
}
