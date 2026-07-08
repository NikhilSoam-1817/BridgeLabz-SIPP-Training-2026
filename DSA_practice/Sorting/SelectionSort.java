package DSA_practice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    
    public static void selectionSort(int[] ratings) {
        int n = ratings.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap
            int temp = ratings[i];
            ratings[i] = ratings[minIndex];
            ratings[minIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of movie ratings:");
        int n = sc.nextInt();
        
        int[] ratings = new int[n];
        System.out.println("Enter the ratings:");
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }
        
        selectionSort(ratings);
        
        System.out.println("Sorted ratings:");
        System.out.println(Arrays.toString(ratings));
        
        sc.close();
    }
}
