package Assignment5;
import java.util.Scanner;
public class A5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of data: ");
        int range = sc.nextInt();
        double sum=0;
        System.out.println("Enter "+range+" data:");
        for(int i=1;i<=range;i++){
            int num=sc.nextInt();
            sum += (1.0/num);
        }
        double harmonic_mean=(double)range/sum;
        System.out.println(harmonic_mean);
        sc.close();
    }
}