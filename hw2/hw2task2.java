// pеализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package hw2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class hw2task2 {
    public static void main(String[] args) {
        int[] arrToSort = new int[] {1,3,5,3,2,1,4,5,89};
        arrToSort = sort(arrToSort);
        System.out.println(java.util.Arrays.toString(arrToSort));
    }
    public static int[] sort(int[] array) {
        // i - номер прохода
        // Logger logger = Logger.getLogger (flogger.class.getName ());	
        // FileHandler fh = new FileHandler("log.xml");
        // logger.addHandler(fh);

        // XMLFormatter xml = new XMLFormatter();
        // fh.setFormatter(xml);

        int temp=0;
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
            // logger.log (Level.INFO, "Дошёл до этой точки");
            logArray(array);
        }
    return array;
    }

    public static void logArray(int[] array){
        Logger logger = Logger.getAnonymousLogger();	
        try(FileWriter writer = new FileWriter("/Users/user/Desktop/Python/JAVA_projects/hw2/log.txt", true)){
            for(int j: array){
                writer.write(j+" ");
            }
            writer.write("\n");
            logger.log(Level.INFO, "Запись в лог-файл сделана.\n");
        } catch (IOException ex) {
            logger.log(Level.WARNING, ex.getMessage());
        }
    }
}
