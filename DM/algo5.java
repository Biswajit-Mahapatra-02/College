package DM;
import java.util.Scanner;
public class algo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        System.out.print("Enter dividend:");
        int dividend = sc.nextInt();
        String bin=Integer.toBinaryString(exponent);
        int length=bin.length();
        int x=1;
        int power = base % dividend;
        for(int i = 0,j=length-1; i<length; i++,j--){
            String temp = ""+bin.charAt(j);
            if(Integer.parseInt(temp)==1){
                x=(x*power)%dividend;
            }
            power = (power*power)%dividend;
        }
        System.out.println(base+"^"+exponent+" mod"+dividend+" = "+x);
        sc.close();
    }
}