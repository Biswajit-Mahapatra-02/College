package miniProjects;

import java.util.Scanner;
public class PointDemo extends Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point A=new Point();
        Point B=new Point();
        int x,y;
        System.out.print("Enter x coordinate for point1: ");
        x=sc.nextInt();
        System.out.print("Enter y coordinate for point1: ");
        y=sc.nextInt();
        A.setPoint(x, y);
        System.out.print("Enter x coordinate for point2: ");
        x=sc.nextInt();
        System.out.print("Enter y coordinate for point2: ");
        y=sc.nextInt();
        B.setPoint(x, y);
        System.out.println("Given points A and B respectively are: ");
        A.showPoint();
        B.showPoint();
        System.out.println("Distance between points and A and B is: "+A.findDistance(A,B));
        sc.close();
    }
}
