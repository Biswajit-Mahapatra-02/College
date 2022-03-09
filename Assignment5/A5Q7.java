package Assignment5;
import java.util.Scanner;
public class A5Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        for(int i = 1, j =1 ; i <= range ; i++, j+=2){
            if (i%2 == 0)
                sum-=j;
            else
                sum+=j;
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}
