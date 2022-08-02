class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() ==0) {
    		return false;   		
    	}
    	
    	String cleanString ="";  		
    		
    		for(char c: s.toCharArray()) {
    			if(Character.isDigit(c) ||Character.isLetter(c)){
    				cleanString+=c;
    			}
    		}
    		
    		cleanString = cleanString.toLowerCase();
    		int start =0;
    		int end = cleanString.length()-1;
    		while(start<=end) {
    			
    			if(cleanString.charAt(start) != cleanString.charAt(end)) {
    				return false;
    			}
    			start++;
    			end--;
    		} 			    	
        return true;
    }
}
