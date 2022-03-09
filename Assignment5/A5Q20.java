package Assignment5;

import java.util.Scanner;

public class A5Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int div=2;
        while(number > 1){
            if(number%div==0){
                if(number == div)
                    System.out.print(div);
                else
                    System.out.print(div+",");
                number=number/div;
            }
            else
                div++;
        }
    }
}
