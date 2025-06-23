#include<iostream>
using namespace std;
int main(){
    int n,i,j,k;
    cout<<"Enter the size of array:";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of array:";
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
          if(arr[j]<arr[i]){
            k=arr[j];
            arr[j]=arr[i];
            arr[i]=k;
            }
        }
    }
    cout<<"The sorted array : ";
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}

