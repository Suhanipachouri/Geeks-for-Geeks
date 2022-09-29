class Solution {
    int findMaximum(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
