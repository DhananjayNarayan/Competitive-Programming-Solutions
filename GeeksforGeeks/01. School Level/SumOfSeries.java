//https://practice.geeksforgeeks.org/problems/sum-of-series2811/1

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        long x=n;
        long sum=(x*(x+1))/2;;
	    return sum;
    }
}
