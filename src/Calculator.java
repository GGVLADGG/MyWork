import java.util.Scanner;

public class Calculator {
	public static char operation;
	public static Scanner scanner = new Scanner(System.in);
	public static char input;
	public static int pass = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calculate = new Calculate();
        System.out.println("Введіть перше число: ");
        double FirstNumber = scanner.nextDouble();
        System.out.println("Введіть друге число: ");
        double SecondNumber = scanner.nextDouble();
        System.out.println("Оберіть операцію (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        while (pass == 1){
            switch (operation){
                case '+':
                    System.out.println("Відповідь: " + calculate.Summa(FirstNumber, SecondNumber));
                    Repeat();
                    break;
                case '-':
                    System.out.println("Відповідь: " + calculate.Minus(FirstNumber, SecondNumber));
                    Repeat();
                    break;
                case '*':
                    System.out.println("Відповідь: " + calculate.Dobytok(FirstNumber, SecondNumber));
                    Repeat();
                    break;
                case '/':
                    System.out.println("Відповідь: " + calculate.Div(FirstNumber, SecondNumber));
                    Repeat();
                    break;
                default:
                    System.out.println("Ви ввели некоректний символ");
                    Repeat();
            }
        }
	}
	static void Repeat() {
		System.out.println("Спробувати ще раз? ( + / - ) ");
		char input = scanner.next().charAt(0);
        if (input == '-') {
        	pass = 0;
        }
    }
}
 