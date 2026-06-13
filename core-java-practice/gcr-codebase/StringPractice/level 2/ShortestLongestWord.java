import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static String[][] getWordLength(String[] words) {

        String[][] arr = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }

        return arr;
    }

    public static int[] findShortestLongest(String[][] arr) {

        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word: "
                + data[result[0]][0]);

        System.out.println("Longest Word: "
                + data[result[1]][0]);
    }
}