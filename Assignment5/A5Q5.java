package Assignment5;
import java.util.Scanner;
public class A5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();
        int sum=0;
        double avg;
        System.out.println("Enter "+range+" numbers:");
        for(int i = 1 ; i <= range; i++){
            int numbers=sc.nextInt();
            sum+=numbers;
        }
        avg=(double) sum/range;
        System.out.println("The total sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
}
