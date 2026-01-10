#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    int n;
    int m;
    int p;
    int q;
    cin >> n >> m >> p >> q;

    //final ans
    if (n % p == 0 && n / p * q != m){
        cout << "NO" << endl; 
        return;
    }
    cout << "YES" << endl;

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
