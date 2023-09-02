public class LeftRotateArr{
    // Time complexity - O(n)
    // Space complexity - O(1)
    // Variation 1 --> When k = 1
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // add the value at index 0 in a variable
        int temp = nums[0];

        // Iterate through the array from 0 to n-1
        for(int i=1; i<n; i++){
            nums[i] = nums[i+1];
        }
        nums[n-1] = temp;  // adding the value of 0th index to end 
    }

    public static void main(String args[]) {
        int n=5;
        
        int arr[]= {1,2,3,4,5};
        rotate(arr, n);
    }
}