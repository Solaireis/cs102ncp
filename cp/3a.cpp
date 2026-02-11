#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    int n; //number of permutation
    cin >> n;
    for (int i = 1; i < n;i++){
        cout << i + 1 ;
        cout << " ";
    }
    cout << 1 << " "; 
    cout << endl;
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

    ll test_cases{};
    cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here
