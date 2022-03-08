package Assignment5;
import java.util.Scanner;
public class A5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int pass_count=0;
        for ( int i = 0; i < n; ){
            System.out.print("Enter marks: ");
            int marks=sc.nextInt();
            if(marks<0||marks>100){
                System.out.println("Not a valid score. Please try again.");
                continue;
            }
            if(marks>=40)
                pass_count++;
            i++;
        }
        System.out.println(pass_count+" students passed the examination.");
        
        sc.close();
    }
}
