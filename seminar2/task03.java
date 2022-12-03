/*
 * Дана json строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя 
 * StringBuilder, создаст строки вида:
 * Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class task03 {
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {        
        StringBuilder sb = new StringBuilder();
        JSONParser jsonParser = new JSONParser();
        
        Object jsonObj = jsonParser.parse(new FileReader("seminar2/data.json"));

        JSONArray jsonObjects = (JSONArray) jsonObj;
        
        for (Object o : jsonObjects) {
            JSONObject jsonObject = (JSONObject) o;
            
            String studentSecondName = (String) jsonObject.get("фамилия");
            String studentAssessment = (String)jsonObject.get("оценка");
            String studentObject = (String) jsonObject.get("предмет");

            String studentStr = String.format("Студент %s получил %s по предмету %s\n", studentSecondName, studentAssessment, studentObject);
            sb.append(studentStr);
        }

        System.out.println(sb.toString());
    }
}
