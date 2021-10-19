class Check {

    public static  Expressions  CheckData(String math) throws Exception {
        String[] expression = math.split(" ");
        if (expression.length != 3) {
            throw new IllegalArgumentException("введено неверное выражение");
        }
        // далее мы из строки вычленяем элементы и превращаем их в int и прописываем исключения
        int firstNumber = Integer.parseInt(expression[0]);
        int secondNumber = Integer.parseInt(expression[2]);
        String sign = expression[1];
        if (firstNumber > 100 || secondNumber > 100) {
            throw new Exception("введено число больше 100");
        }
        return new Expressions(firstNumber,secondNumber,sign);
    }
}