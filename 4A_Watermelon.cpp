#include<iostream>
using namespace std;
int main()
{
    int number;
    cin >> number;
    if (number%2!=0) 
    {
        cout << "NO\n";
    }else{
        if (number<=2)
        {
            cout << "NO\n";
        }else{
            cout << "YES\n";
        }
        
    }
    
    return 0;
}
