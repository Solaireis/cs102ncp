#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl

using namespace std;

// Write implementation prototypes Here
void solve(){
    // PRINT THE ANSWER!
    //get the number of pairs
    int num;
    cin >> num;

    //generate an array
    vector <long long> a(num + 1) ;
    //generate an array containing the letters
    vector <char> s(num + 1);
    long long sum = 0;
    //add all the pairs
    for (int i = 0; i <num; i ++){
        cin >> s[i] >> a[i];
        sum += a[i];
        //check the length
        if (sum > 100){
        //make this the final solution
            cout << "Too Long" << endl; 
            return;
        } 
    }

    //check length
    //cout << sum << endl;

    //check the length
    // if (sum > 100){
    //    //make this the final solution
    //     cout << "Too Long" << endl; 
    //     return;
    // }

    //otherwise for each pair
    string word ="";
    for (int i = 0; i < num; i++){
        //interate for this ammount
        for (int j = 0; j < a[i]; j++){
            word += s[i] ;
        }
    }
    //print the final word
    cout << word << endl;
    
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

    ll test_cases=1;
    //cin >> test_cases;
    for(int i = 0; i < test_cases; ++i){
        solve();
    }
    return 0;
}

// Implementation Here
