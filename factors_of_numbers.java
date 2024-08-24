import java.util.ArrayList;
import java.util.Scanner;
public class factors_of_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("-1");
            scanner.close();
            return;
        }
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        if (factors.isEmpty()) {
            System.out.println("-1");
        } else {

            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
