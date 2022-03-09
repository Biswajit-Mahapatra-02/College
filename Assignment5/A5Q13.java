package Assignment5;
import java.util.Scanner;
public class A5Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a=0,b=1,c;        
        if(range>2) {
            System.out.print("0 1 ");
            for (int i = 2; i <= range; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        else if(range == 1)
            System.out.println(1);
        else if(range == 0)
            System.out.println(0);
        else
            System.out.println("invalid range");
            sc.close();
    }
}
