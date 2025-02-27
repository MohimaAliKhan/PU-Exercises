
package onlineAssignment3;


public class Stack {
    private int[] arr;
    private int top;
    private int size;
    
    Stack(int size){
      this.size = size;
      arr=new int[size];
      top=-1;
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
           System.out.println("The stack is empty.");
       }
       else {
        top--;
       }
    }
    public void pick(){
        System.out.println("pick:"+arr[top]);
    }
    public void display(){
        System.out.println("Stack:");
        for(int i=0;i<=top;i++){
            System.out.println("  "+arr[i]);
        }
    }
    
}
