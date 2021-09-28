// https://practice.geeksforgeeks.org/problems/sum-of-array2326/1

class Solution {
    int sum(int arr[], int n) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
}
