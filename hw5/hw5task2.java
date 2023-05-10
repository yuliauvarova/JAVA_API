// Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hw5task2 {
    public static void main(String[] args) {
        //строка
        String personsString = 
        "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        //список всех имен
        String[] persons=personsString.split(",");
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < persons.length; i++) {
            persons[i]=persons[i].trim();
            String[] eachPerson = persons[i].split(" ");
            List<String> eachPersonList = new ArrayList<>(Arrays.asList(eachPerson));
            namesList.add(eachPersonList.get(0));
        }
        System.out.println(namesList);
        
        //создаем словарь частотности
        Map<String,Integer> namesMap = new HashMap<>();
        for (int i = 0; i < namesList.size(); i++) {
            if (!namesMap.containsKey(namesList.get(i))) {
                namesMap.put(namesList.get(i), 1);
            }
            else{
                int value = namesMap.get(namesList.get(i));
                value=value+1;
                namesMap.put(namesList.get(i), value);
            }
        }

        //создаем список уникальных имен = ключей словаря
        List<String> valueList = new LinkedList<>(namesMap.keySet());
        
        //создаем копию словаря для будущего отсортированного вывода 
        Map<String,Integer> namesMapCopy = new HashMap<>();
        for (int i = 0; i < valueList.size(); i++) {
            namesMapCopy.put(valueList.get(i),namesMap.get(valueList.get(i)));
        }

        System.out.println("");
        
        //выводим частотность имен в порядке убывания
        int currentLen = valueList.size();
        int len = valueList.size();
        for (int j = 0; j < len; j++) {
            int currentMax = 0;
            String maxName = new String();
            int indexInList=0;
            for (int i = 0; i < currentLen; i++) {
                if(namesMapCopy.get(valueList.get(i))>currentMax){
                    currentMax=namesMapCopy.get(valueList.get(i));
                    maxName = valueList.get(i);
                    indexInList = i;
                }
            }
            System.out.printf("%s:%d\n", maxName, currentMax);
            namesMapCopy.remove(maxName);
            valueList.remove(indexInList);
            currentLen=currentLen-1;
        }
    }
}
