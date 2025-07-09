class Calculation {
    int cal(int a, int b) {
        return a + b;
    }

    double cal(double a, double b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        System.out.println("The added value: " + calc.cal(3, 5));         
        System.out.println("The subtract value: " + calc.cal(7.7, 2.9));      }
}
