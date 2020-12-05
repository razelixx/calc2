import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNum = scanner.nextDouble();
        double result;
        System.out.println("Введите операцию: +, -, * или /");
        char operator = scanner.next().charAt(0);

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
    }
}