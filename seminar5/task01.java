import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class task01 {
    public static void main(String[] args) {
        // Map<String, List<String>> phoneBook;
        // phoneBook = new HashMap<String, List<String>>();

        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.put("Иван", Arrays.asList("12345", "67890"));
        phoneBook.put("Василий", Arrays.asList("12345", "67890"));
        phoneBook.put("Николай", Arrays.asList("12345", "67890"));

        Object phoneNo = phoneBook.get("Иван");
        System.out.println("Номер телефона Ивана: " + phoneNo);

        System.out.println("В телефонной книге: ");

        Set nameSet = phoneBook.keySet();
        for (Object name : nameSet) {
            System.out.println("Имя: " + name + " Номер телеофна: "
                    + phoneBook.get(name));
        }

        Object oldPhone = phoneBook.put("Николай", Arrays.asList("2222222"));

        System.out.println("Старый номер телефона Николая:" + oldPhone);
        System.out.println("Новый номер телефона Николая:" + phoneBook.get("Николай"));
    }
}