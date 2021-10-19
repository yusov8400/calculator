class Arithmetics {
    public static void solve(Expressions expressions) throws Exception {

        switch (expressions.getSign()) {
            case "+" -> System.out.println("результат: " + (expressions.getFirstNumber() + expressions.getSecondNumber()));
            case "-" -> System.out.println("результат: " + (expressions.getFirstNumber() - expressions.getSecondNumber()));
            case "/" -> System.out.println("результат: " + (expressions.getFirstNumber() / expressions.getSecondNumber()));
            case "*" -> System.out.println("результат: " + (expressions.getFirstNumber() * expressions.getSecondNumber()));
            default -> throw new Exception("недопустимая операция");
        }
    }
}

