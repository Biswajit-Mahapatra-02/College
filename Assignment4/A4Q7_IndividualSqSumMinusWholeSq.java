package Assignment4;

public class A4Q7_IndividualSqSumMinusWholeSq {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for ( int i = 1; i <= 10; i++)
            sum1+=i*i;
        System.out.println("The sum of the squares of the first ten natural numbers is: "+sum1);
        for ( int i = 1; i <=10; i++)
            sum2+=i;
        sum2= sum2*sum2;
        System.out.println("The square of the sum of the first ten natural numbers is: "+sum2);
        System.out.println("Hence the difference b/w the sum of the squares of the first ten natural numbers\n" +
                "and the squares of the sum is: "+(sum2-sum1));
    }
}
