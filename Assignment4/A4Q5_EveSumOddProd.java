package Assignment4;
import java.util.Scanner;
public class A4Q5_EveSumOddProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        System.out.print("Enter range: ");
        int N = sc.nextInt();
        for( int i = 1 ; i <= N; i++)
            if (i%2 == 0)
                sum+=i;
            else
                product*=i;
        
        System.out.println("Sum of all even numbers = "+sum);
        System.out.println("Product of all odd numbers = "+product);
        sc.close();
    }
}
