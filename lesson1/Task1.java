// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            sum += i;
        }

    System.out.printf("Факториал %d  =  %d \n", num, factorial);
    System.out.printf("Треугольное число %d = % d \n", num, sum); 
}
    
}