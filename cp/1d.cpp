#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    int x; //len of the array
    cin >> x;

    //create vector
    vector <int> a(x);
    for (int i = 0; i < x; i++){
        cin >> a[i];
    }

    //sort in ascending order
    //sort(a.begin(), a.end());

    int sum = 0;
    int small = a[0];

    //No Operations
    for (int i = 0; i < x; i++){
        for (int j = 0; j <= i; j++){
            if (small > a[j]){ 
                small = a[j];
            }
        }
        sum = sum + small;
    } 

    // //if operation is done
    // int small2 = a[0];
    // int big2 = a[0];
    // int sum2 = 0;
    // int smallCount = 0;
    // int bigCount = 0;
    // for (int i = 0; i < x; i++){
        
    //     if (big2 < a[i]){
    //         small2 = big2;
    //         smallCount = bigCount;
    //         big2 = a[i];
    //         bigCount = i;

    //     }  else if (small2 < a[i] && i != bigCount){ 
    //             small2 = a[i];
    //             smallCount = i;
    //     }
    // } 
    // if (a[smallCount] == a[bigCount]){
    //     a[bigCount] = small2 + big2;
    //     a[smallCount] = 0;

    // } else {
    //     a[smallCount] = small2 + big2;
    //     a[bigCount] = 0;
    // }
    int sum2 = 0;
    a[x-2] = a[x-2] + a[x-1];
    a[x-1] = 0;
    small = a[0];
    for (int i = 0; i < x; i++){
        for (int j = 0; j <= i; j++){
            if (small > a[j]){ 
                small = a[j];
            }
        }
        sum2 = sum2 + small;
    } 

    if (sum2 < sum){
        cout  << sum2 << endl; 
        return;
    }
    cout  << sum << endl;


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
