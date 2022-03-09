package Assignment5;

import java.util.Scanner;

public class A5Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("GCD= "+findGCD(a, b));
        sc.close();
    }
    public static int findGCD(int a, int b) { 
        if(b == 0)
            return a; 
        return findGCD(b, a%b); 
    }


}
