
#include<iostream>
using namespace std;

struct node {
    int data;
    struct node*next;
};
struct node *head;

void insert_first(int val){
    struct node *tamp =new node;
    tamp->data=val;
    tamp->next=head;
    head=tamp;
}
void insert_middle(int val,int key){
    struct node*tamp;
    tamp=head;
    struct node *new_node;
    new_node->data=val;
    while(tamp->next!=NULL){
        tamp=tamp->next;
        if(tamp->data=key){
            new_node->next=tamp->next;
            tamp->next=new_node;
            break;
        }
    }
}

void insert_last(int val){
    struct node*tamp;
    tamp=head;
    struct node *new_node;
    new_node->data=val;
    while(tamp->next!=NULL){
        tamp=tamp->next;
        if(tamp->next=NULL){
            new_node->next=tamp->next;
            tamp->next=new_node;
            break;
        }
    }
}

void delete_first(){
    head=head->next;
}

void delete_middle(int key){
    struct node*tamp;
    tamp=head;

    while(tamp->next!=NULL){
        tamp=tamp->next;
        if(tamp->data=key){
            tamp=tamp->next;
            break;
        }
    }
}

void delete_last(){
    struct node*tamp;
    tamp=head;

    while(tamp->next!=NULL){
        tamp=tamp->next;
        if(tamp->next=NULL){
            tamp=tamp->next;
            break;
        }
    }
}
void display(){
  struct node* tamp;
  tamp=head;
  cout<<tamp->data<<"The list of data : ";
  while(tamp->next!=NULL){
    cout<<tamp->data<<" ";
    tamp=tamp->next;
  }
}

node* search_node(int key){
    struct node *tamp;
    tamp= head;
    while (tamp->next!=NULL){
        if(tamp->data==key){
            cout<<"The data is found!";
            return tamp;
        }
        else {
            tamp=tamp->next;
    }
   cout<<"The data is not found!";
    return nullptr;
}
int main(){

}
