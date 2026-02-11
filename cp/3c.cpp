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
    int n; //number of permutation
    cin >> n;
    std::vector<std::pair<int,int>> a(n);
    std::vector<std::pair<int,int>> empty(n);

    for (int i = 0; i < n; i++){
        cin>>a[i].first>>a[i].second;
    }
    sort(a.begin(), a.end(), [](pair<int, int> x, pair<int, int> y) {
        return x.second < y.second;
    });

    // choose the first then interate over the rest
    int counter = 1;
    int end = a[0].second;
    for (int i = 1; i < n; i++){   
        if ( end <= a[i].first){
            end = a[i].second;
            counter++;
        }
    }
    // shift the first into the last pair

    // // check by iterating thru multiple loops
    // for (int i = 0; i < n; i++){    
    //     for (int i = 1; i < n; i++){    
    //         empty[i-1] = a[i];
    //     }
    //     empty[n-1] = a[0];
    //     for (int i = 0; i < n; i++){    
    //         a[i] = empty[i];
    //     }
    //     int counter2 = 1;

    //     end = a[0].second;
    //     for (int i = 1; i < n; i++){   
    //     if ( end <= a[i].first){
    //         end = a[i].second;
    //         counter2++;
    //     }
    //     if (counter2 > counter){
    //         counter = counter2;
    //         }
    //     } 


    // }


    cout << counter << endl;
    // now we know the start and 
    //end time of each movie
    // find the possible movies which allows for the next 



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
