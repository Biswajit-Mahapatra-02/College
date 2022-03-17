package Assignment3;
import java.util.*;

public class A3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Rahul, Ayush, Ajay;
		System.out.println("Entert the ages of Rahul,Ayush,Ajay respectively");
		Rahul = sc.nextInt();
		Ayush = sc.nextInt();
		Ajay = sc.nextInt();
		if (Rahul < Ayush && Rahul < Ajay) {
			System.out.println("Youngest is Rahul");
		} else if (Ayush < Rahul && Ayush < Ajay) {
			System.out.println("The youngest is Ayush");
		} else {
			System.out.println("The youngest is Ajay");
		}
		sc.close();
	}

}
