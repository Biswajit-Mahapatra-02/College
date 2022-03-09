package Assignment5;

import java.util.Scanner;

public class A5Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        x=Math.toRadians(x);
        System.out.printf("Sine func: "+"%6f%n", Math.sin(x));
        double sum=0;
        for(int i=1,j=1;i<=10;i++,j+=2)
            if(i%2==0)
                sum -= (Math.pow(x,j)/ calculateFactorial(j));
            else
                sum += (Math.pow(x,j)/ calculateFactorial(j));
        System.out.printf("Sine Taylor series expansion result: "+"%6f%n", sum);
        sc.close();
    }
    public static double calculateFactorial(double n){
        int fact=1;
        for(int i =1; i<=n;i++)
            fact*=i;
        return fact;
    }
}
