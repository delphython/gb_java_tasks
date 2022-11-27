/*
 * *+Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса,
 * например 2? + ?5 = 69. Требуется восстановить выражение
 * до верного равенства. Предложить хотя бы одно решение 
 * или сообщить, что его нет.
 */

public class task14 {
    public static void main(String[] args) {
        String equationString = "2?2 + ?5 = 697";

        String[] splitEquationString = equationString.split(" ");

        String firstNum = splitEquationString[0];
        String secondNum = splitEquationString[2];
        
        int firstNumLen = splitEquationString[0].length();
        int secondNumLen = splitEquationString[2].length();
        
        int summ = Integer.parseInt(splitEquationString[4]);

        int firstNumIndex = firstNum.indexOf("?");
        int secondNumIndex = secondNum.indexOf("?");

        int maxNumIndex = firstNumIndex < secondNumIndex ? 1 : 2;
        int firstNumEnlarger = (int) Math.pow(10, firstNumLen-firstNumIndex-1);
        int secondNumEnlarger = (int) Math.pow(10, secondNumLen-secondNumIndex-1);

        while (firstNumIndex >= 0) {
            if (firstNumIndex == 0) {
                firstNum = firstNum.replace(firstNum.substring(firstNumIndex,firstNumIndex+1), "1");
            }
            else  {
                firstNum = firstNum.replace(firstNum.substring(firstNumIndex,firstNumIndex+1), "0");
            }
            firstNumIndex = firstNum.indexOf("?");
        }
        while (secondNumIndex >= 0) {
            if (secondNumIndex == 0) {
                secondNum = secondNum.replace(secondNum.substring(secondNumIndex,secondNumIndex+1), "1");
            }
            else  {
                secondNum = secondNum.replace(secondNum.substring(secondNumIndex,secondNumIndex+1), "0");
            }
            secondNumIndex = secondNum.indexOf("?");
        }

        int firstNumInt = Integer.parseInt(firstNum);
        int secondNumInt = Integer.parseInt(secondNum);

        while (summ > (firstNumInt + secondNumInt)) {
            if ((summ - (firstNumInt + secondNumInt)) >= 10) {
                if (maxNumIndex == 1) {
                    firstNumInt += firstNumEnlarger;
                }
                if (maxNumIndex == 2) {
                    secondNumInt += secondNumEnlarger;
                }
            }
            else {
                if (maxNumIndex == 1) {
                    secondNumInt += secondNumEnlarger;
                }
                if (maxNumIndex == 2) {
                    firstNumInt += firstNumEnlarger;
                }
            }
        }

        if (firstNumInt + secondNumInt == summ) {
            System.out.printf("%d + %d = %d", firstNumInt, secondNumInt, summ);
        }
        else {
            System.out.println("Решения нет");
        }
    }
}
