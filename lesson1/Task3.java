
// Реализовать простой калькулятор

package lesson1;
import java.util.*;

public class Task3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double num1 = in.nextDouble();
        System.out.print("Введите число 2: ");
        double num2 = in.nextDouble();
        System.out.print("Введите знак '+','-','*','/' : ");
        char sign = in.next().charAt(0);
        double result;
        switch (sign) {
            case '+': result = num1 + num2; 
                
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2; 
                
                break;
            case '/': result = num1 / num2;
                break;
            default: System.out.printf("Error!");
                return;
        }
        System.out.printf(num1+ " " + sign +" " +num2+ " = "+result);
}
    
}
