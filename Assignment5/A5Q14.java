package Assignment5;
import java.util.Scanner;
public class A5Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a=0,b=1,c;
        System.out.print("0, 1, ");
        if(range>2) {
            for (int i = 3; i <=range; i++) {
                c = a + b;
                if(range==i) {
                    System.out.println(c);
                    break;
                }

                System.out.print(c + ", ");
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
    }
}
