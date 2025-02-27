
package onlineAssignment3;

public class Tester {
    public static void main(String[] args) {
        System.out.println("--Stack--");
        Stack stack=new Stack(5);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pick();
        stack.display();
        
        System.out.println("\n--Queue--");
        Queue queue=new Queue(5);
        queue.push(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.pick();
        queue.display();
    }
}
