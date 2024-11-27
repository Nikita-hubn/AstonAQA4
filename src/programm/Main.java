package programm;

public class Main {
    public static long factorial(Integer n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не может быть");
        } else if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Integer number = 10;
        System.out.println("Факториал " + number + " = " + factorial(number));
    }
}
