class Expressions {
    private final int firstNumber;
    private final int secondNumber;
    private final String sign;

    public Expressions(int firstNumber, int secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getSign() {
        return sign;
    }
}
