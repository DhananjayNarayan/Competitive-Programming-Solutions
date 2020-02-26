/* Mr. X's birthday is in next month. This time he is planning to invite N of his friends. He wants to distribute some chocolates to all of his friends after party. He went to a shop to buy a packet of chocolates.
At chocolate shop, each packet is having different number of chocolates. He wants to buy such a packet which contains number of chocolates, which can be distributed equally among all of his friends.
Help Mr. X to buy such a packet.

Input:
First line contains T, number of test cases.
Each test case contains two integers, N and M. where is N is number of friends and M is number number of chocolates in a packet.

Output:
In each test case output "Yes" if he can buy that packet and "No" if he can't buy that packet.  */  

#include <iostream>
 
using namespace std;
 
int main() {
	int t;
	cin>>t;
	int m,n;
	while(t--)
	{
	    cin>>n>>m;
	    if( m%n==0 )
	    cout<<"Yes"<<endl;
	    else
	    cout<<"No"<<endl;
	}
}
 
