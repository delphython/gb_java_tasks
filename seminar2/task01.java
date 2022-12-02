/*
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: 
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

import org.json.JSONObject;
import org.json.JSONArray;


public class task01 {
    public static void main(String[] args) throws Exception {
        String sqlSearchString = "select * from students where ";
        String jsonString = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        
        StringBuilder sb = new StringBuilder();    
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray keys = jsonObject.names();

        sb.append(sqlSearchString);

        for (int i = 0; i < keys.length(); ++i) {
            String key = keys.getString(i);
            String value = jsonObject.getString(key);

            if (!value.equals("null")) {
                String whereStr = String.format("%s = '%s' and ", key, value);
                sb.append(whereStr);
            }
        }
        int endIndex = sb.length() - 1;
        
        sb.replace(endIndex-4, endIndex, "");

        System.out.println(sb.toString());
    }
}
