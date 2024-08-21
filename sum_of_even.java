import java.util.Scanner;
public class sum_of_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        System.out.println("The sum is: " + sum);

    }
}
