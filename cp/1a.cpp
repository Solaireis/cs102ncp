#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    int num;
    cin >> num;

    // make array
    vector <int> a(num+1);
    for (int i = 0; i < num; i++){
        cin >> a[i];
    }
    
    int x;
    cin >> x;
    for (int i = 0; i < num; i++){
        if (a[i] == x){
            cout << "Yes" << endl; 
            return;
        }

    }
    cout << "No" << endl;
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
   // cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here