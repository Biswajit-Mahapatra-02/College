package Assignment5;
import java.util.Scanner;
public class A5Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount=sc.nextDouble();
        int months=sc.nextInt();
        double annual_interest_rate = sc.nextDouble();
        double monthly_interest_rate = (annual_interest_rate/100.0)/12;
        double sum = 0.0;
        for (int  i = 1 ; i <= months; i++)
            sum = (amount+sum) * (1+monthly_interest_rate);
        System.out.printf("Result amount: "+"%.3f%n", sum);
    }
}
