/*
 * Напишите метод, который находит самую длинную 
 * строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 */

public class task05 {
    public static void main(String[] args) {
        String[] stringArray = {"excel", "exull", "excxxxx"};

        String commonPrefix = stringArray[0];
        
        for (int i = 1; i < stringArray.length; ++i)
            while (stringArray[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);
                if (commonPrefix.isEmpty()) commonPrefix = "";
            }

        System.out.printf(commonPrefix);
    }
}
