package Assignment4;
import java.util.Scanner;

public class A4Q1_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start value: ");
        int start = sc.nextInt();
        System.out.print("Enter end value: ");
        int end = sc.nextInt();
        System.out.print("Enter jump value: ");
        int jump = sc.nextInt();
        for (int i = start; i <= end; i+=jump){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
