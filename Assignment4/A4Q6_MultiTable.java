package Assignment4;
import java.util.Scanner;
public class A4Q6_MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1 ; i <=10 ; i++)
            System.out.println(n+" x "+i+" = "+(n*i));
            sc.close();
    }
}
