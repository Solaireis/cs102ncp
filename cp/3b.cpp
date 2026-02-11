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
    vector <long long> a(n) ;
    for (int i = 0; i < n; i++){
        cin >> a[i];
    }
    //xor the value
    bool isNotSolved = true;
    int x = 0;
    int xr = 0;
    vector <long long> empty(n) ;
    while (isNotSolved){
        x = a[0];
        for (int i = 1; i < n; i++){
            xr = xr ^ a[i] ;
        }
        if (x == xr){
            cout << x << endl;
            return;
        } else {
            for (int i = 1; i < n; i++){
                empty[i-1] = a[i];
            } 
            empty[n-1] = a[0];
            for (int i = 0; i < n; i++){
                a[i] = empty [i];
            } 
        }
    }
    


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
