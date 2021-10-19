
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) throws Exception {
        System.out.println("Пожалуйста введите выражение (числа не больше 100 (включительно)");
        Scanner sc = new Scanner(System.in);
        //читаем следующую строчку
        String math = sc.nextLine();
        Expressions expressions = Check.CheckData(math);
        Arithmetics.solve(expressions);
    }
}
