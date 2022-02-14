package Assignment5;
import java.util.Scanner;
public class A5Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse=0,d,dup=number;
        int i = 0;
        while(dup!=0){
            i++;
            dup/=10;
        }
        dup=number;
        i--;
        while(dup!=0){
            d=dup%10;
            reverse=reverse+(int)(d*Math.pow(10,i));
            dup/=10; i--;
        }
        System.out.println(reverse);
    }
}
