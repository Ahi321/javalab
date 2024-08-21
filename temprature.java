import java.util.Scanner;
public class temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Fahrenheit");
        double S= sc.nextDouble();
        System.out.println("Enter End Fahrenheit");
        double E= sc.nextDouble();
        System.out.println("Enter gap");
        double W= sc.nextDouble();
        for(double i=S;i<=E;i+=W){
         double   c=(5*(i-32))/9;
            System.out.println( "Fahrenheit:"+i+"in Celcius:"+c);

        }

    }
}
