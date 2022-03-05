package Assignment4;
import java.util.Scanner;
public class A4Q9_PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextInt();
        double finder=1;
        for ( int i = 1; finder<=n; i++){
            double x = Math.pow(2,i);
            if(x>=n)
                break;
            finder = x;
        }
        System.out.println("Found: "+finder);
        sc.close();
    }

}
