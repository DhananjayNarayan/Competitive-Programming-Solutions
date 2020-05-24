"""
Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. 
You are given  scores.
Store them in a list and find the score of the runner-up.

Input Format:
The first line contains n . The second line contains an array of n integers each separated by a space.

Output Format:
Print the runner-up score.

Sample Input 0
5
2 3 6 6 5
Sample Output 0
5
"""

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    li=list(arr)
    new_list = set(li)
    new_list.remove(max(new_list))
    
    print(max(new_list))
