package Assignment4;

import java.util.Scanner;

public class A4Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0,dup,d;
        boolean control=true;
        do{
            System.out.print("num= ");
            num=sc.nextInt();
            dup=num;
            while (dup!=0){
            d = dup%10;
            sum+=d;
            dup/=10;
        }
        if (sum%9==0)
            System.out.println(num+" is divisible by 9");
        sum=0;
        System.out.println("continue?(y/n)");
        if(sc.next().charAt(0)=='n')
            control=false;
        }while(control);
        sc.close();
    }    
}
