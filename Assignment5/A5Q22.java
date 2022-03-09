package Assignment5;

import java.util.Scanner;

public class A5Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=0;
        for(int i = 1 ;i<n;i++)
            if(n%i==0)
                count++;
        if(count==1)
            System.out.print("Prime");
        else
            System.out.print("Not prime");
        sc.close();
    }
}
