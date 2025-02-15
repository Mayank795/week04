package exceptionpropagation;
public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            divisionbyzero2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }

    public static void divisionbyzero1() {
        int result = 10 / 0;
    }

    public static void divisionbyzero2() {
        divisionbyzero1();
    }
}
