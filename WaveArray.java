class Solution {
    public static void convertToWave(int n, int[] arr) {
    // code here
    if(n%2==0){
        for(int i =0;i<n;i=i+2){
        int temp=arr[i+1];
        arr[i+1]=arr[i];
        arr[i]=temp;
        }
    }
    else{
        for(int i =0;i<n-1;i=i+2){
        int temp=arr[i+1];
        arr[i+1]=arr[i];
        arr[i]=temp;
    }
    }
    }
}
