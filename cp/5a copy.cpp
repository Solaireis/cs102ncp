#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl
#include <utility> // Required for std::pair

using namespace std;

// Write implementation prototypes Here
void solve(){

    ll n;
    ll m;
    cin >> n;
    cin >> m;

    // make array for black and white
    vector <ll> blk(n);
    vector <ll> wht(m);

    int sum = 0;
    
    for (int i = 0; i < n; i++){
        cin >> blk[i];
        // cout << blk[i] << endl;
    }
    
    for (int i = 0; i < m; i++){
        cin >> wht[i];
        // cout << wht[i] << endl;
    }

    sort(blk.begin(), blk.end());
    sort(wht.begin(), wht.end());
    // cout << n << endl;
    // cout << m << endl;
    int count = 0;
    int ncount = 0;
    for (int i = 0; i < n; i++){
        if (sum + blk[n - i - 1] > sum){
            sum += blk[n - i - 1];
            ncount++;
            if ( count < ncount && count < m && wht[m - 1 - count] > 0){
                sum += wht[m - count - 1];
                count ++;
            }
        } else { 
            if( count < m && count < ncount && wht[m - 1 - count] > 0){
                sum += wht[m - count - 1];
                count ++;
            }   else if ( count < m && count <= ncount && wht[m - 1 - count] > 0 && wht[m - 1 - count] + blk[n - i - 1] > 0){
                sum += blk[n - i - 1] + wht[m - count - 1];
                count++;
                ncount++; 
            }
        }    
    }
    cout << sum << endl;

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

    ll test_cases;
    cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here
