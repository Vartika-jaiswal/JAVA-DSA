package Arrays.Stacksandqueues;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;
  
    public QueueUsingStacks() {
      first = new Stack<>();
      second = new Stack<>();
    }
  
    public void add(int item) {
      first.push(item);
    }
    
     public int remove() throws Exception{
        while(!first.isEmpty()){ 
        second.push(first.pop ());
      }
      int removed = second.pop();
  
       while(!second.isEmpty()){
       first.push(second.pop());
      }
  
      return removed;
    }
  
    public int peek() {
      while(!first.isEmpty()){ 
        second.push(first.pop ());
      }
      int peeked = second.peek();
       while(!second.isEmpty()){
       first.push(second.pop());
      }
      return peeked;
    }
    
    public boolean isEmpty(){
     return first.isEmpty();
    }
     public static void main(String[] args) throws Exception{
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue.remove());
        // System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.add(4);
        System.out.println(queue.remove());
    }
}
