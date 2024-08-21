import java.util.Scanner;
public class total_salary {
    private static Object Total_Salary1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary");
        double basic_salary = sc.nextDouble();
        System.out.println("enter grade");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        double HRA =0.2*basic_salary;
        double DA =0.5*basic_salary;
        double PF = 0.11*basic_salary;
        int Allow;
        if (grade == 'A') {
            Allow = 1700;
        }
        else if (grade == 'B') {
            Allow = 1500;
        }
        else{
            Allow = 1300;
        }
        double Total_Salary= basic_salary+HRA+DA+Allow-PF;
        int Total_Salary1= (int) Total_Salary;
        System.out.println("Total Salary is "+Total_Salary1);
    }
}
