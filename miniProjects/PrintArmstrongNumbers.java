package miniProjects;

public class PrintArmstrongNumbers {
   public static void main(String[] args) {
       PrintArmstrongNumbers obj = new PrintArmstrongNumbers();
       int count=0;
        for(int i=0;i<=1000000;i++)
            if(obj.isArmstrongNumber(i)){
                System.out.print(i+" ");
                count++;}
        System.out.println("\nNumber of armstrong numbers between 0 and 1000000: "+count);
   }
    public boolean isArmstrongNumber(int n) {
       int dup = n,sum=0,d;
        while(dup!=0){
            d=dup%10;
            sum+=(Math.pow(d,numLength(n)));
            dup/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
   }
    public int numLength(int num){
        int length = 0;
        while(num!=0){
            length++;
            num/=10;
        }
        return length;
   }
}