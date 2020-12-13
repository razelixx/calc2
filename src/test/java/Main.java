import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();
        int result;
        System.out.println("Введите операцию: +, -, * или /");
        char operator = scanner.next().charAt(0);

        try {
        switch (operator) {
            case '+':
                Summa sum = new Summa();
                sum.summa(firstNum, secondNum);
                break;
            case '-':
                Minus min = new Minus();
                min.minus(firstNum, secondNum);
                break;
            case '*':
                Multiply mp = new Multiply();
                mp.multyply(firstNum, secondNum);
                break;
            case '/':
                Divide div = new Divide();
                div.divide(firstNum, secondNum);
                break;
            default:
                System.out.println("Операция не распознана.");
        }
        } catch (ArithmeticException e2) {
            System.out.println("Ошибка! Деление на 0!");
        } catch (Exception allEx) {
            System.out.println("Ошибка!");
        }
    }
}