package Assignment5;
import java.util.Scanner;
public class A5Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        sc.close();
    }
}
