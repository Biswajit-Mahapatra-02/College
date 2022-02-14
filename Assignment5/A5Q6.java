package Assignment5;
import java.util.Scanner;
public class A5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range;
        range = sc.nextInt();
        double harmonic_mean=calculateHarmonicMean(range);
        System.out.println(harmonic_mean);
    }
    public static double calculateHarmonicMean(int range){
        double sum=0, harmonic_mean=0;
        for(int i=1;i<=range;i++)
            sum = sum + (1.0/i);
        return (double)range/sum;
    }
}