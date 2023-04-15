package hw1;

import java.util.Scanner;

public class hwtask3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = scanner1.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = scanner1.nextInt();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите знак операции: ");
        String oper = iScanner.nextLine();
        switch (oper) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "^":
                System.out.println(Math.pow(num1,num2));
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
