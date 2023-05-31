import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите число 1:");
        int number = new Scanner(System.in). nextInt();

        System.out.println("Введите число 2:");
        int number2 = new Scanner(System.in). nextInt();

        int sum= number+ number2;
        System.out.println("Сумма: "+ sum);

        int ras= number- number2;
        System.out.println("Разность: "+ ras);

        int pro= number*number2;
        System.out.println("Произведение: "+ pro);

        double chast= (double) number/number2;
        System.out.println("Частное: "+ chast);

    }
}
