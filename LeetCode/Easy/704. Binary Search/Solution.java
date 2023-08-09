class Solution {
    public int search(int[] nums, int target) {

        int length = nums.length;
        int start = 0;
        int end = length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                start = start+1;
            }
        }
        
        return -1;
    }
}
