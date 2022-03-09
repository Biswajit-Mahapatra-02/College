package Assignment5;
import java.util.Scanner;
public class A5Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=1.0;
        int x = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            sum = sum + (Math.pow(x,i)/calculateFactorial(i));
        }
        System.out.println(sum);
        sc.close();
    }
    public static double calculateFactorial(double n){
        int fact=1;
        for(int i =1; i<=n;i++)
            fact*=i;
        return fact;
    }
}
