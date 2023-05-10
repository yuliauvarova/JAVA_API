// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package hw5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hw5task1 {
    public static void main(String[] args) {
        Map<String,List<String>> phonebook = new HashMap<>();
        List<String> ivanovPhones = new LinkedList<>();
        ivanovPhones.add("1245");
        ivanovPhones.add("+987");
        phonebook.put("Иванов", ivanovPhones);        
        List<String> pitonovPhones = new LinkedList<>();
        pitonovPhones.add("98776");
        pitonovPhones.add("+0023");
        phonebook.put("Питонов", pitonovPhones);

        for (var item : phonebook.entrySet()) {
            System.out.printf("[%s:%s]\n", item.getKey(), item.getValue());
        }
    }
}
