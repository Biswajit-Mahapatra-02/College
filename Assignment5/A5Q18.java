package Assignment5;
import java.util.Scanner;
public class A5Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        System.out.print("Enter n value: ");
        double n = sc.nextDouble();
        double root=1;
        for(int i = 1; i<=10 ; i++){
            root = (1/n) * (((n - 1)*root)+(a/Math.pow(root,n-1)));
        }
        System.out.println(n+" root of "+ a + " is: "+root);
        sc.close();
    }
}