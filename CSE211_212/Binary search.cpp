#include<iostream>
using namespace std;

int main(){
    int n,i,k,first,last,mid;
    cout<<"Enter the size of array:";
    cin>>n;
    int arra[n];
    cout<<"Enter sorted array in ascending order: ";
    for(i=0;i<n;i++){
        cin>>arra[i];
    }
    cout<<"Enter the search key:";
    cin>>k;
    first=0;
    last=n;
    string res="Not found";
    while(first<=last){
        mid=(first+last)/2;
        if(arra[mid]==k){
            res="found";
            break;
        }
        else if(arra[mid]<k){
            first=mid+1;
        }
        else last=mid-1;
    }
    cout<<"The integer is "<<res;
    return 0;
}
