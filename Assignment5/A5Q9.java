package Assignment5;

import java.util.Scanner;

public class A5Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int fact=1;
        for(int i =1; i<=n;i++)
            fact*=i;
        System.out.println("Result: "+ (Math.pow(x,n)/fact));
        sc.close();
    }
}
