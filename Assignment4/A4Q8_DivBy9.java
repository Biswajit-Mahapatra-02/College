package Assignment4;
public class A4Q8_DivBy9 {
    public static void main(String[] args) {
        int num1=123456;
        int num2=154368;
        int num3=621594;
        int sum = 0;
        int dup=num1;
        while (dup!=0){
            int d = dup%10;
            sum+=d;
            dup/=10;
        }
        if (sum%9==0)
            System.out.println(num1+" is divisible by 9");
        dup = num2;
        while (dup!=0){
            int d = dup%10;
            sum+=d;
            dup/=10;
        }
        if (sum%9==0)
            System.out.println(num2+" is divisible by 9");
        dup=num3;
        while (dup!=0){
            int d = dup%10;
            sum+=d;
            dup/=10;
        }
        if (sum%9==0)
            System.out.println(num3+" is divisible by 9");
    }
}
