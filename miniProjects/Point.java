package miniProjects;

public class Point {
     int x;
     int y;
    void setPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    void showPoint(){
        System.out.println("x coordinate: "+x);
        System.out.println("y coordinate: "+y);
    }
    int findDistance(Point A, Point B){
        int xDiff=B.x-A.x;
        int yDiff=B.y-A.y;
        return (int)(Math.sqrt(Math.pow(yDiff,2)+Math.pow(xDiff,2)));
    }
}
