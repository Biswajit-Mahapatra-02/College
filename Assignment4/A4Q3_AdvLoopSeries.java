package Assignment4;

public class A4Q3_AdvLoopSeries {
    public static void main(String[] args) {
        String ruler1="1";
        System.out.println(ruler1);
        for (int i=1;i<5;i++) {
            int p;
            System.out.print(ruler1);
            for (p=2;p<=i;p++) {
                System.out.print(p+ruler1);
            }
            if(p>=4){
                for (int z=p-2;z>1;z--) {
                    System.out.print(z+ruler1);
                }
            }
            for (int x=p;x>1;x--) {
                System.out.print(x+ruler1);
                if(x>=4){
                    for (int k=2;k<=i;k++)
                        System.out.print(k+ruler1);
                    x--;
                }
            }
            System.out.println();
        }
    }
}
