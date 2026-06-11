import java.util.*;

public class day3 {

    public static void main(String[] args) {

        int[] stock = {10, 25, 5, 40, 15};

        findMinMax(stock);

         findDuplicate(stock);

          int k = 2;

        rotateArray(stock, k);
    }





// A warehouse stores item quantities in an array. Find the max, min,
// total stock, and detect duplicates. Extend: rotate the stock array by
// k positions (simulate daily shift handover), and transpose a 2D shelf
// grid.



// find min and max
    public static void  findMinMax(int[] arr){
    
    

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }





















//   Duplicates



    public static void findDuplicate(int[] arr) {

        System.out.print("Duplicate Elements : ");

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    boolean alreadyPrinted = false;

                    for(int k = 0; k < i; k++) {
                        if(arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if(!alreadyPrinted) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }
    }

// Rotated array



    // Function to rotate array by k positions
    public static void rotateArray(int[] arr, int k) {

        int n = arr.length;

        int[] rotated = new int[n];

        // Rotation logic
        for(int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.print("Rotated Array : ");

        for(int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    

    
}

        
    



