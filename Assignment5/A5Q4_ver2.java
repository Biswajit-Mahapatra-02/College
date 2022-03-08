package Assignment5;

import java.util.Scanner;

public class A5Q4_ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_count=0, p_count=0, n_count=0,  n;
        double avg, totalsum=0.0;
        System.out.print("Enter numbers: ");
        do{
            n = sc.nextInt();
            if(n==0)
                break;
            num_count++;
            if(n>0)
                p_count++;
            else
                n_count++;
            totalsum+=n;
        }while(n!=0);
        if(num_count>0) {
            System.out.println("The number of positives is " + p_count);
            System.out.println("The number of negatives is " + n_count);
            System.out.println("The total is " + totalsum);
            avg = (double) totalsum / num_count;
            System.out.println("The average is " + avg);
        }
        else{
            System.out.println("Enter an integer, the input ends if it is: 0");
            System.out.println("No numbers are entered except 0");
        }
        sc.close();
    }
}
