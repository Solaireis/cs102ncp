#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    //cout << "hello world" << endl;
    ll num;
    double x;
    //ll sum = 0;
    cin >> num >> x;
    // make array
    vector <int> a(num);
    ll gondola = 0;
    for (int i = 0; i < num; i++){
        cin >> a[i];
    }

    //sort in ascending order
    sort(a.begin(), a.end());

    // start with the biggest one/ greedy algorithm 
    //(find the pairs which match the biggest )
    ll left = 0;
    ll right = num - 1;
    while (a[right] == x){
            right--;
            gondola = gondola + 1; 
    }
    while (left <= right){
        
        int sum = a[left] + a[right];
        if (left == right){
            gondola = gondola + 1; 
            break;
        } else if (((left + 1) == right) && sum > x){
            gondola = gondola + 2;  
            break;
        }

        if (sum <= x){
            gondola = gondola + 1;
            left++;
            right--;
        }
        else if( sum > x){
            gondola = gondola + 1;
            right--;
        }
        

    }
    cout << gondola << endl;



    
    
}
// Driver code
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);
    if (fopen("test.inp", "r") != NULL) {
        freopen("test.inp", "r", stdin);
        freopen("test.out", "w", stdout);
        freopen("test.err", "w", stderr);
    }

    ll test_cases = 1;
    //cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here
