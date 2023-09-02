public class RotateArrbyK{
    // Right Rotation
    // Brute force approach
    // TC: O(n)  Sc: O(k)
    public static void rightRotate(int arr[], int n, int k){
        n = arr.length;
        if(n == 0){
            return;
        }

        k = k % n;
        if(k > n) return;

        // create temp arr
        int temp[] = new int[k];
        
        // adding last k elements to temp arr
        for(int i=n-k; i < n; i++){
            temp[i - n + k] = arr[i];
        }
        for(int i = n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }

        for(int i=0; i<k; i++){
            arr[i] = temp[i];
        }
    }

    // Time complexity - O(n)
    // Space complexity - O(k)
    public static void leftRotate(int arr[], int n, int k){
        if(n == 0) return;
        k = k%n;
        if(k > n) return;

        // creating temp arr of k size
        int temp[] = new int[k];

        // Adding first k elements to temp arr
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            arr[i] = arr[i+k];
        }

        for(int i= n-k; i<n; i++){
            arr[i] = temp[i - n + k];
        }
    }

    // Reverse Algo
    // Reverse the last k elements of arr
    // Time complexity - O(n)
    // Space complexity - O(1)
    public static void reverse(int arr[], int start, int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void RotateRight(int arr[], int n, int k){
        // Reverse first n-k elements
        reverse(arr, 0, n-k-1);

        // reverse last k elements
        reverse(arr, n-k, n-1);

        // reverse whole arr
        reverse(arr, 0 , n-1);
    }

    // Rotate elements to left
    // reverse first k elements 
    // Tc: O(N) Sc: O(1)
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
    }
    public static void Rotateeletoleft(int[] arr, int n, int k) {
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k , n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
      }
}