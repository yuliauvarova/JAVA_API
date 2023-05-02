// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. 
// Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

package hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class hw2task1 {
    public static void main(String[] args) {

    String students = readFileToString("/Users/user/Desktop/Python/JAVA_projects/hw2/Students.txt");

    students=students.substring(1, students.length()-3);

    String[] studentsArray = students.split(",");
    for (int i = 0; i < studentsArray.length; i++) {
        studentsArray[i]=studentsArray[i].replace("\"","");
        studentsArray[i]=studentsArray[i].trim();
    }

    StringBuilder studentsLine = new StringBuilder();
    for (int index = 0; index < studentsArray.length; index++) {
        studentsLine.append(studentsArray[index]);
        studentsLine.append(":");
    }

    String[] studentsForSQL = studentsLine.toString().split(":");
 
    System.out.printf("SELECT * FROM students WHERE\n%s = \"%s\" AND %s = \"%s\" AND %s = \"%s\"\n",studentsForSQL[0], studentsForSQL[1], studentsForSQL[2], studentsForSQL[3], studentsForSQL[4], studentsForSQL[5]);

    }

private static String readFileToString(String path) {
    StringBuilder students = new StringBuilder(); 
    
    try{
        BufferedReader reader = new BufferedReader (new FileReader(path));
        String line = reader.readLine();
        while(line !=null) {
            students.append(line).append("\n");
            line = reader.readLine();
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("Ошибка чтения файла.");
    }
    return students.toString();
}
}