package Assignment5;

import java.util.Scanner;

public class A5Q16_ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n,d,reverse;
        String Rev="";
        while(dup!=0){
            d = dup%10;
            Rev+=d;
            dup/=10;
        }
        reverse=Integer.parseInt(Rev);
        System.out.println("Reverse: "+reverse);
        sc.close();
    }
}