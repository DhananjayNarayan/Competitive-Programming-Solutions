class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        List<Integer> resultSet = new ArrayList<Integer>(); //to store the result (upon encountering duplicates)

        for(int i:nums){
            if(numSet.add(i)==false){
                resultSet.add(i);
            }
            numSet.add(i);
        }
        return resultSet;
    }
}
