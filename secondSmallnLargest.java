import java.util.*;
public class secondSmallnLargest{
    // Brute force approach
    // Works only when the array doesn't contain duplicate elements
    // Time complexity - O(NlogN)
    // Space complexity - O(1)
    public static void getElement(int arr[], int n){
        n = arr.length;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        if(n == 0 || n == 1){
            System.out.println(-1);
        }
        Arrays.sort(arr);
        int small = arr[1];  // second element is second smallest
        int large = arr[n-2];  // second last element is second largest
        System.out.println("Second smallest" + small);
        System.out.println("Second largest:" + large);
    }
    
    // Better solution
    // Time complexity - O(n)
    // Space complexity - O(1)
    public static void getElement1(int arr[], int n){
        n = arr.length;
        if(n == 0 || n == 1){
            System.out.println(-1);
        }

        int small = Integer.MAX_VALUE;
        int second_Small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(int i=0; i<n; i++){
            if(arr[i] < second_Small  && arr[i] != small){
                second_Small = small;
            }

            if(arr[i] > second_largest && arr[i] != large){
                second_largest = arr[i];
            }
        }
        System.out.println(second_Small);
        System.out.println(second_largest);
    }

    // Optimal solution
    // Time complexity - O(n)
    // Space complexity - O(1)
    public static int secondSmallest(int arr[], int n){
        n = arr.length;
        if(n < 2){
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < small){
                small = arr[i];
                second_small = small;
            } else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }

    static private int secondLargest(int[] arr, int n){
        if(n<2) return -1;
        
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++){
            if (arr[i] > large){
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }
        return second_large;
    }
}