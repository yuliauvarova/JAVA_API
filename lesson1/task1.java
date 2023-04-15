package lesson1;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class task1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
     

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime day = LocalTime.of(12, 0, 0);
        LocalTime evening =LocalTime.of(17, 0, 0);
        LocalTime morning =LocalTime.of(6, 0, 0);
        LocalTime night =LocalTime.of(00, 0, 0);

        if (now.compareTo(night)>=0 && now.compareTo(morning)<0) {
            System.out.printf("Доброй ночи, %s!\n", name);
        }
        else if (now.compareTo(morning)>=0 && now.compareTo(day)<0) {
            System.out.printf("Доброе утро, %s!\n", name);
        }
        else if (now.compareTo(day)>=0 && now.compareTo(evening)<0) {
            System.out.printf("Добрый день, %s!\n", name);
        }
        else {
            System.out.printf("Добрый вечер, %s!\n", name);
        }

        iScanner.close();
    }
}
