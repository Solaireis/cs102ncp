#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl
#include <utility> // Required for std::pair

using namespace std;

// Write implementation prototypes Here
void solve(){
// Number of ancient cities
ll n;
cin >> n;
vector <pair<ll, ll>> routes(n-1);
vector <ll> luck(n-1);
ll sum = 0;
for (int i = 0; i < n -1 ; i++){
    cin >> routes[i].first >> routes[i].second;
    cin >> luck[i];

}
for (int i = 0; i < n-1; i++){
    sum += luck[i];
}
for (int i = 0; i < n-2; i++){
    for (int j = 1; j < n-1; j++){
        sum += luck[i] ^ luck[j];
        cout << sum << endl; 
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

    ll test_cases = 1;
    //cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here
