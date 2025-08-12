#include<iostream>
using namespace std;
struct node{
    int data;
    node* next;
};
node* top= NULL;

void enQueue(int key){
    node* tamp=new node;
    tamp->data=key;
    tamp->next=top;
    top=tamp;
}

int deQueue(){
    node* tamp=new node;
    tamp=top;
    if(top==NULL){
        cout<<"\nQueue under flow!";
        return NULL;
    }
    while(tamp->next!=NULL){
        tamp=tamp->next;
    }
    int val=tamp->data;
    tamp=NULL;
    return val;
}
int main(){
    enQueue(1);
    enQueue(2);
    enQueue(3);
    enQueue(4);
    cout<<"DeQueued values:";
    cout<<deQueue()<<" ";
    cout<<deQueue()<<" ";
    cout<<deQueue()<<" ";
    cout<<deQueue()<<" ";
    cout<<deQueue()<<" ";
    return 0;
}
