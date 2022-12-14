
/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class task03 {
    public static void main(String[] args) throws FileNotFoundException {
        String errStr = "";
        String[] nums = new String[2];
        Console console = System.console();
        System.setErr(new PrintStream(new File("task03_log.txt")));

        for (int i = 0; i < 2; ++i)
        {
            Boolean repeat = true;
            do {
                nums[i] = console.readLine("Введите %d-е число: ", i + 1);
                errStr = String.format("Пользователь ввел %d-е число = %s", i + 1, nums[i]);
                System.err.println(errStr);

                String repeatYN = console.readLine("Изменить %d-е число? (y/n): ", i + 1);

                if (!repeatYN.equals("y")) {
                    errStr = String.format("Пользователь выбрал изменить %d-е число", i + 1);
                    System.err.println(errStr);

                    repeat = false;
                }

            } while (repeat);
            
        }
        
        Boolean repeat = true;
        do {
            String mathOperation = console.readLine("Введите математическое действие,\nгде + сложение,\n- вычитание,\n* умножение,\n/ деление: ");
            errStr = String.format("Пользователь ввел математическое действие: %s", mathOperation);
            System.err.println(errStr);

            String repeatYN = console.readLine("Изменить математическое действие? (y/n): ");

            if (!repeatYN.equals("y")) {
                errStr = "Пользователь выбрал изменить математическое действие";
                System.err.println(errStr);

                repeat = false;
            }
        

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
                                errStr = String.format("Результат выражения: %f", inputFirstNumber + inputSecondNumber);
                                break;
                            case '-':
                                console.printf("%f - %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber - inputSecondNumber);
                                errStr = String.format("Результат выражения: %f", inputFirstNumber - inputSecondNumber);
                                break;
                            case '*':
                                console.printf("%f * %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber * inputSecondNumber);
                                errStr = String.format("Результат выражения: %f", inputFirstNumber * inputSecondNumber);
                                break;
                            case '/':
                                console.printf("%f / %f = %f", inputFirstNumber, inputSecondNumber, inputFirstNumber / inputSecondNumber);
                                errStr = String.format("Результат выражения: %f", inputFirstNumber / inputSecondNumber);
                                break;
                            default: console.printf("Введен неизвестный символ математической операции");
                            errStr = "Введен неизвестный символ математической операции";
                                break;
                        }
                    System.err.println(errStr);
                }
                catch (Exception e)
                {
                    errStr = String.format("Что-то здесь не так: %s", e);
                    console.printf(errStr);
                    System.err.println(errStr);
                }
            }
        } while (repeat);
    }
}
