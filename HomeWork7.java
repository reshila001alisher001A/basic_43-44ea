package homeWork7;

import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        //Task-1
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        if (f < 18)
        {
            System.out.println("Нельзя идти смотреть кино ");
        }
        else
        {
            System.out.println("Можно идти смотреть кино ");
        }
        //Task-2
        Scanner scanner1 = new Scanner(System.in);
        int year  = scanner1.nextInt();
        if (year % 100 ==0 && year % 400 ==0 && year % 4 ==0)
        {
            System.out.println("високостный год ");
        }
        else {
            System.out.println("не високостный год ");
        }
        //Task-3
        System.out.println("сколько печенье хочешь? ");
        Scanner scanner2 = new Scanner(System.in); // 4
        int kolichestvoPechenie  = scanner2.nextInt(); // = 4
        System.out.println("сколько у вас есть денег? "); //
        Scanner scanner3 = new Scanner(System.in);
        int money  = scanner3.nextInt(); // = 1.0
        float cena = 0.5F;
        if( kolichestvoPechenie   * cena <= money){
            System.out.println("Mozhno");
        }
        else {
            System.out.println("Nelzya");
        }
        //Task-4
        Random random = new Random();
        boolean r = random.nextBoolean();
        if (r == true){
            System.out.println("орел");
        }
        else if (r == false){
            System.out.println("решка");
        }
        //Task-5

    }
}
