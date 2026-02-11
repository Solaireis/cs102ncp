#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl
#include <utility> // Required for std::pair

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    //cout << "hello world" << endl;
    ll N;
    ll M;
    cin >> N >> M;
    vector <pair<ll, ll>> a(M);

    for (int i = 0; i < M; i++){
        cin >> a[i].first >> a[i].second;
    }

    //sort the pair array
    sort(a.begin(), a.end(), [](pair<ll, ll> x, pair<ll, ll> y) {
        return (x.first - x.second) < (y.first - y.second);
    });

    //drink all coke
    ll E = N;
    N = 0;
    ll sticker = 0;

for(int choice = 0; choice < M; choice++){
        ll A = a[choice].first;
        ll B = a[choice].second;

        if(E < A) continue;    // can't afford this exchange

        ll loss = A - B;
        ll k = (E - B) / loss; // max times to do this exchange

        sticker += k;
        E -= k * loss;
    }
    
    cout << sticker << endl;

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
