import java.util.Random;

public class FootballTeam {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }

        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Player Heights:");

        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nMean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
    }
}