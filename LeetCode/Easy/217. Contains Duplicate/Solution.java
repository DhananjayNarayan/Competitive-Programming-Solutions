class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numset = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(numset.contains(nums[i])){
                return true;
            }
           numset.add(nums[i]);
        }

        return false;
    }
}
