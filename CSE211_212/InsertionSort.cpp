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
        for(j=i;j>0;j--){
          if(arr[j]<arr[j-1]){
            k=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=k;
            }
        else
        break;
        }
    }
    cout<<"The sorted array : ";
    for(i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
