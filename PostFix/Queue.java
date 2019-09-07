package collections.list.generics;

public class Queue<T extends Comparable<T>>
{  
   List<T> data;
    
   public Queue()
   {
     data = new LinkedList<>(); 
   }
   public void enqueue(T val)
   {  
      data.add(val);
   }
   public T dequeue()
   {
      return data.remove(0);
   }
   public boolean isEmpty()
   {
      return data.isEmpty();
   }
}
