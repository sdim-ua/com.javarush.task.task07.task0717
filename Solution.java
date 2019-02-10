import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int a = 0; a < 10; a ++)
    {
        String s = reader.readLine();
        list.add(s);
    }   
        
        
        
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        
        for (String s : list) 
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        
             for (int i = 0; i < list.size(); i++)
             {
                 list.add((i + 1), list.get(i++)); 
             }
        return list;
    }
}
