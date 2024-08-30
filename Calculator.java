public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(1, 2, 3);
        double sum3 = calc.add(1.5, 2.5);

        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 1, 2, and 3: " + sum2);
        System.out.println("Sum of 1.5 and 2.5: " + sum3);
    }
}


