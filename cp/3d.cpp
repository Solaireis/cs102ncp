#include <bits/stdc++.h>

#define fi first
#define se second
#define ll long long
#define debug(x) std::cerr << #x << " = " << (x) << std::endl
#include <utility> // Required for std::pair

using namespace std;

// Write implementation prototypes Here
void solve(){
    int c1; //usb only
    int c2; //ps2 only
    int c3; //ps2 and usb 
    cin >> c1 >> c2 >> c3;

    int n; //number of mouses
    cin >> n;
    vector <pair<ll, string>> a(n);
    vector <ll> u(n);
    vector <ll> p(n);
    int uCount = 0;
    int pCount = 0;
    for (int i = 0; i < n; i++){
        cin>>a[i].first>>a[i].second;
        if (a[i].second == "USB"){
            u[uCount] = a[i].first;
            uCount++;
        } else {
            p[pCount] = a[i].first;
            pCount++;
        }
    }
    vector <ll> uf(uCount);
    vector <ll> pf(pCount); 
    for (int i = 0; i < uCount; i++){
        uf[i] = u[i];
    } 
    for (int i = 0; i < pCount; i++){
        pf[i] = p[i];
    } 
    
    sort(uf.begin(), uf.end());
    sort(pf.begin(),pf.end());
    //uCount is the number of usb mice availble
    //pCount is the number of ps2 mice available
    //first fufil c1 and c2,
    ll result = 0;
    int pcCount = 0;
    int uMiceUsed = 0;
    int pMiceUsed = 0;
    //first case if c1 is more than uCount, buy all USB mice
    if (c1 > uCount){
        for (int i = 0; i < uCount; i++){
            result = result + uf[i];
            pcCount++;
            uMiceUsed++;

        }
    } else if (uCount > c1){
        for (int i = 0; i < c1; i++){
            result = result + uf[i];
            pcCount++;
            uMiceUsed++;
        } 
    }
    //solve for ps2 only pc
    if (c2 > pCount){
        for (int i = 0; i < pCount; i++){
            result = result + pf[i];
            pcCount++;
            pMiceUsed++;
        }
    } else if (pCount > c2){
        for (int i = 0; i < c2; i++){
            result = result + pf[i];
            pcCount++;
            pMiceUsed++;

        } 
    }
    // remaining c3
    for (int i = 0 ; i < c3; i++){
        if (pCount > pMiceUsed ){
            result = result + pf[pMiceUsed];
            pMiceUsed++;
            pcCount++;
        } else if (uCount > uMiceUsed) {
            result = result + uf[pMiceUsed];
            uMiceUsed++;
            pcCount++; 
        } 
    }

    cout << pcCount << " " << result << endl;


    // so now we should have the mouses we need sort by the prices and also the brand
    

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
