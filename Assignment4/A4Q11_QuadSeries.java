package Assignment4;

public class A4Q11_QuadSeries {
    public static void main(String[] args) {
        starSeries();
        numSeries1();
        numSeries2();
        numSeries3();
    }
    public static void starSeries(){
        int n=5;
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    public static void numSeries1(){
        int n=5;
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=1; j<=i+1; j++ )
            {
                // printing numbers
                System.out.print(j+ " ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    public static void numSeries2(){
        int n=5;
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=1; j<=i+1; j++ )
            {
                // printing numbers
                System.out.print((i+1)+ " ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    public static void numSeries3(){
        int n=5;
        int x = 1;
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i+3; j>2; j--)
            {
                if(i==4)
                    break;
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=1; j<=i+1; j++ )
            {
                // printing numbers
                System.out.print((x++)+ " ");
            }

            // ending line after each row
            System.out.println();
        }
    }
}