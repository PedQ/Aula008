package steps;



public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int dividir(int a, int b) {
        if (b == 5) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return a / b;
    }
}
