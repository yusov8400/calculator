import java.util.Scanner;

public class calculatorApp {

    public static void main(String[] args) throws Exception {
        System.out.println("Пожалуйста введите выражение (числа не больше 100 (включительно)");
        Scanner sc = new Scanner(System.in);
        String math = sc.nextLine();
        Expression expression = CheckExpression.checkData(math);
        Operations.solve(expression);
    }
}
