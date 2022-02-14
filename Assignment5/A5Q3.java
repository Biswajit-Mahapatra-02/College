package Assignment5;

public class A5Q3 {
    public static void main(String[] args) {
        int num_count=0;
        for(int i = 100;i<=1000;i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                num_count++;
                if (num_count % 10 == 0)
                    System.out.println();
            }
        }
    }
}
