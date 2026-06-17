public class expHandling {
    public static void main(String args[]){

        int n=20;
        int m=0;

        try {
            int a=n/m;
            System.out.print(a);
        } catch (ArithmeticException e) {
            System.out.println("0 is in denominator");
        }


        
    }
}

