/*
 * Пусть дан список сотрудников:
 * Написать программу, которая найдет и выведет повторяющиеся
 * имена с количеством повторений. Отсортировать по убыванию популярности.
 */

import java.util.*;
import java.util.stream.*;

public class task02 {
    public static void main(String[] args) {
        String[] employeeslist = {"Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        
        int employeeslistLength = employeeslist.length;

        String[] employeesFNamelist = new String[employeeslistLength];

        for (int i = 0; i< employeeslistLength; i++) {
            String firstName = employeeslist[i].split(" ")[0];
            employeesFNamelist[i] = firstName;
        }

        Map<String, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < employeesFNamelist.length; ++i) {
            if (!map.containsKey(employeesFNamelist[i])) 
                map.put(employeesFNamelist[i], new TreeSet<Integer>());
            map.get(employeesFNamelist[i]).add(i);
        }
        
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        for (String i : map.keySet()) {
            unsortedMap.put(i, map.get(i).size());
        }

        Map<String,Integer> sortedMapReversed =  unsortedMap.entrySet().
            stream().
            sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
            collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        System.out.println(sortedMapReversed);
    }
}
