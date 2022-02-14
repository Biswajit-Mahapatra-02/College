package Assignment5;
import java.util.Scanner;
public class A5Q4_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int num_count=0;
        int p_count=0;
        int n_count=0;
        int total=0;
        int n;
        double avg;
        System.out.print("Enter numbers: ");
        do{
            n = sc.nextInt();
            if(num_count==0&&n==0) {
                System.out.println("Enter an integer, the input ends if it is: 0");
                System.out.println("No numbers are entered except 0");
                n=1;
                continue;
            }
            if(n==0)
                break;
            num_count++;
            if(n>0)
                p_count++;
            else
                n_count++;
            total+=n;
        }while(n!=0);
        System.out.println("The number of positives is "+p_count);
        System.out.println("The number of negatives is "+n_count);
        System.out.println("The total is "+total);
        avg=(double)total/num_count;
        System.out.println("The average is "+avg);
    }
}
