package Assignment5;

import java.util.Scanner;

public class A5Q17 {
    public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        double Number = sc.nextDouble();
        double n = 2;
        double root=1;
        for(int i = 1; i<=10 ; i++){
            root = (1/n) * (((n - 1)*root)+(Number/Math.pow(root,n-1)));
        }
        System.out.println("The square root of " + Number + " is " + root);
        sc.close();
        }
 
    
}
