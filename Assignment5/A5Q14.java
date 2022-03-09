package Assignment5;
import java.util.Scanner;
public class A5Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of terms :");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a + ", "+b+", ");
        for(int i=1 ; i<=(n-2)/2 ; i++)
        {
            a=a+b;
            b=a+b;
            System.out.print(a+", "+b+", ");
        }
        if(n%2!=0)
        {
            a=a+b;
            System.out.println(a);
        }
            sc.close();
    }
}
