package Assignment5;
import java.util.Scanner;
public class A5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int pass_count=0;
        for ( int i = 0; i < n; i++){
            System.out.print("Enter marks: ");
            int marks=sc.nextInt();
            if(marks>100){
                System.out.println("Not a valid mark.");
                System.out.println("Please enter marks between 0 and 100");
                i--;
                continue;
            }
            if(marks>=40)
                pass_count++;
        }
        if(pass_count>1)
            System.out.println(pass_count+" students passed the examination.");
        else
            System.out.println(pass_count+" student passed the examination.");
    }
}
