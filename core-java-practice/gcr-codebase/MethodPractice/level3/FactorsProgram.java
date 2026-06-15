public class FactorsProgram {

    public static int[] factors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                arr[index++] = i;
        }

        return arr;
    }

    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    public static long productFactors(int[] arr) {
        long product = 1;
        for (int x : arr)
            product *= x;
        return product;
    }

    public static double cubeProduct(int[] arr) {
        double product = 1;
        for (int x : arr)
            product *= Math.pow(x, 3);
        return product;
    }

    public static void main(String[] args) {
        int num = 12;

        int[] factors = factors(num);

        System.out.println("Greatest Factor = " + greatestFactor(factors));
        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Cube Product = " + cubeProduct(factors));
    }
}