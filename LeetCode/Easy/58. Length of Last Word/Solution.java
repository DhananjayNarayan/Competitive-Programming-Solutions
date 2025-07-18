class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){ //encounter a character
                count++;
            }
            else{
                //space char encountered
                //it the count is already greater than one 
                //- because we encountereda character
                if(count>0){
                    return count;
                }
            }
        }
        return count;        
    }
}
