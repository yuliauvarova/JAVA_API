// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class hw3_t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Сколько элементов будет в списке? ");
        int listSize = scanner.nextInt();
        scanner.close();

        List<Integer> randomList = new ArrayList<> (listSize);
        for (int i = 0; i < listSize; i++) {
            Random random = new Random();
            int randNum = random.nextInt(0,100);
            randomList.add(randNum);
        }
        System.out.println(randomList);

        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            if(randomList.get(i)%2!=0){
                oddList.add(randomList.get(i));
            }
        }
        System.out.println(oddList);
    }
}
