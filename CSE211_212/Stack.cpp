#include<iostream>
using namespace std;
struct node{
    int data;
    node* next;
};
node* top= NULL;
void push(int key){
    node* tamp=new node;
    tamp->data=key;
    tamp->next=top;
    top=tamp;
}

int pop(){
    if(top==NULL){
        cout<<"\nStack under flow!";
    }
    else{
      int val=top->data;
      top=top->next;
      return val;
    }
}

int main(){
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    cout<<"Popped values:";
    cout<<pop()<<" ";
    cout<<pop()<<" ";
    cout<<pop()<<" ";
    cout<<pop()<<" ";
    cout<<pop()<<" ";
    cout<<pop()<<" ";
    return 0;
}
