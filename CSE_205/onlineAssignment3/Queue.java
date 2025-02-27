
package onlineAssignment3;


public class Queue {
    private int[] arr;
    private int top;
    private int front;
    private int size;
    
    Queue(int size){
      this.size = size;
      arr=new int[size];
      top=-1;
      front=0;
    }
    public void push(int number){
       if(size==top){
           System.out.println("The stuck is full.");
       }
       else {
           top++;
           arr[top]=number;
       }
    }
    public void pop(){
        if(top==-1){
           System.out.println("The stuck is empty.");
       }
       else {
        front++;
       }
    }
    public void pick(){
        if(top==-1){
           System.out.println("The stuck is empty.");
       }
       else {
          System.out.println("pick:"+arr[front]);
        }
    }
    public void display(){
        System.out.println("Queue:");
        for(int i=front;i<=top;i++){
            System.out.println("   "+arr[i]);
        }
    }
}
