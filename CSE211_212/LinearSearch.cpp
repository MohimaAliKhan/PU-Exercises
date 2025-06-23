#include<iostream>
using namespace std;
int main(){
    int n,i,k;
    string res="not found";
    cout<<"Enter the size of array:";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of array:";
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Enter the searching key:";
    cin>>k;
    for(i=0;i<n;i++){
        if(arr[i]==k){
            res="found";
            break;
        }
    }
    cout<<"The element is "<<res;
    return 0;
}
