#include <iostream> 
#include <string> 
#include <algorithm> 
using namespace std;
 
int main() 
{ 
 
 string str; 
 getline(cin, str); 
 string ostr = str; 
 reverse(str.begin(), str.end()); 
 if(str==ostr) 
 cout<<"YES"; 
 else 
 cout<<"NO"; 
}
