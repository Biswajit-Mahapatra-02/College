package Assignment5;
import java.util.Scanner;
public class A5Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double l = sc.nextDouble();
        double x = n;
        double root;
        int count = 0;
        while (true)
        {
            count++;
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < l)
                break;
            x = root;
        }
        System.out.println(root);
    }
}
