import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;
import java.io.*;
public class PostFixProblem
 {
    public static void main(String[] args)
     {
         String test = "";
         int result = 0;
         int val1 = 1;
         int val2 = 1;
         Stack <String> stk = new Stack();
         try
          {
             Scanner kbd = new Scanner(new File("postfix.txt"));
              
             while(kbd.hasNext())
              {
                 test = kbd.nextLine();
                 String [] arr = test.split(" ");
                 for(int i = 0; i < arr.length; i++)
                 {
                     if(arr[i].matches("^[-+]?\\d+"))
                     
                      {
                         stk.push(arr[i]);
                      }
                                      
                      else if(arr[i].equals("+"))
                     {
                        if(stk.size() > 0)
                        {
                           val1=Integer.parseInt(stk.pop());
                        }
                        if(stk.size() > 0)
                        {
                           val2=Integer.parseInt(stk.pop());
                         }
                        result= val2 + val1;
                        stk.push(""+result);
            
                      }
                     else if(arr[i].equals("-"))
                     {
                         if(stk.size() > 0)
                         {

                           val1=Integer.parseInt(stk.pop());
                        }
                        if(stk.size() > 0)
                        {

                           val2=Integer.parseInt(stk.pop());
                        }
                        result= val2 - val1;
                        stk.push(""+result);
                     
                     }
                     else if(arr[i].equals("*"))
                     {
                      if(stk.size() > 0)
                      {
                        val1=Integer.parseInt(stk.pop());
                      }
                      if(stk.size() > 0)
                      {

                        val2=Integer.parseInt(stk.pop());
                      }
                        result= val2 * val1;
                        stk.push(""+result);
                        
                     }
                     else if(arr[i].equals("/"))
                     {
                         if(stk.size() > 0)
                        {
                           val1=Integer.parseInt(stk.pop());
                        }
                        if(stk.size() > 0)
                        {

                          val2=Integer.parseInt(stk.pop());
                        }
                        result= val2 / val1;
                        stk.push(""+result);
                     
                     }
                     }
                     
                     if(stk.size() == 1)
                     {
                       System.out.println(stk.pop());
                     }
                     else if(stk.size() ==0)
                     {
                        System.out.println("Empty Stack");
                      }
                      else
                      {
                         System.out.println("Empty Stack");

                        for( int i = 0; i <= stk.size() + 1 ; i++)
                       {
                           stk.pop();
                       }

                   } 
                     
             } 
                  
               }
              
              catch(FileNotFoundException ex)
              {
                  System.out.println("File is no there");
              }
                                       
              
         }
                    
             

     }
