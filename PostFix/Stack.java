package collections.list.generics;

public class Stack<T extends Comparable<T>>
{
   List<T> data;
   
   public Stack()
   {
      data = new LinkedList<>();
   }
   public T pop()
   {
      return data.remove(data.size() - 1);
   }
   public T peek()
   {
      return data.get(data.size() - 1);
   }
   public void push(T val)
   {
      data.add(val);
   }
   public boolean isEmpty()
   {
       return data.isEmpty();
   }
   
   public int size()
   {
      return data.size();
   }
   
   public boolean lastOne()
   {
      if(data.size() == 1)
         return true;
       else
         return false;
   }
   public static void main(String[] args)
   {
      Stack<Integer> s = new Stack<>();
      System.out.println("Pushing: " );
      for( int i=0; i<5; i++ ) 
      {
         System.out.print(i + " ");
         s.push(i);
      }
      System.out.println("\n---------------");
      System.out.println("Popping: " );
      while( s.isEmpty() == false )
      {
         System.out.print( s.pop() + " ");
      }
      System.out.println( "\nOne more: " + s.pop());
   }
}