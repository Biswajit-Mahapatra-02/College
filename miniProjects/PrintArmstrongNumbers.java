package miniProjects;

public class PrintArmstrongNumbers {
   public static void main(String[] args) {
       int count=0;
        for(int i=0;i<=1000000;i++)
            if(isArmstrongNumber(i)){
                System.out.print(i+" ");
                count++;}
        System.out.println("\nNumber of armstrong numbers between 0 and 1000000: "+count);
   }
   public static boolean isArmstrongNumber(int n) {
       int dup = n,sum=0,d;
        while(dup!=0){
            d=dup%10;
            sum+=(d*d*d);
            dup/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
   }
}
