class Solution {
    public int missingNumber(int[] nums) {

        int missing = 0;
        int n = nums.length;
        int sumOfn = (n*(n+1))/2;

        for(int i:nums){
            sumOfn = sumOfn -= i;
            missing = sumOfn;
        }

        return missing;
        
    }
}
