// 2. К калькулятору из предыдущего дз добавить логирование.



import java.util.logging.*;
import java.util.Scanner;
public class Task2 {

    
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
            default: Logger logger= Logger.getAnonymousLogger();
                logger.log (Level.WARNING, "Не то");;
                return;
        }
        Logger logger = Logge3r.getAnonymousLogger();
        logger.log (Level.INFO, "Все хорошо");
        System.out.printf(num1+ " " + sign +" " +num2+ " = "+result);
}
    
}


