class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i =0;
        for(int j=1;j<nums.length;j++){ //startting from second element. If it is different, replace the next element of arr[i] with arr[j]
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j]; // this adds all n unique elements in the first n places
                i++;
            }
        }
        return i+1;
    }
}
