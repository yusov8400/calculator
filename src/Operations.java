class Operations {
    public static void solve(Expression expression) throws Exception {
        switch (expression.getSign()) {
            case "+" -> System.out.println("результат: " + (expression.getFirstNumber() + expression.getSecondNumber()));
            case "-" -> System.out.println("результат: " + (expression.getFirstNumber() - expression.getSecondNumber()));
            case "/" -> System.out.println("результат: " + (expression.getFirstNumber() / expression.getSecondNumber()));
            case "*" -> System.out.println("результат: " + (expression.getFirstNumber() * expression.getSecondNumber()));
            default -> throw new Exception("недопустимая операция");
        }
    }
}

