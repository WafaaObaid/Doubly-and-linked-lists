/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructure_a2;

import java.util.Iterator;

/**
 *
 * @author VICTUS
 */
public class DataStructure_A2 {

    public static void main(String[] args) {
      
        SingleLinkedList1<toDoList> list = new SingleLinkedList1<toDoList>();
        
       toDoList todo1 = new toDoList(5,"math",true);
       toDoList todo2 = new toDoList(7,"program",false);
       toDoList todo3 = new toDoList(9,"biology",true);
       toDoList todo4 = new toDoList(4,"physics",true);
       toDoList todo5 = new toDoList(1,"comp.sci",false);
       toDoList todo6 = new toDoList(10,"software",false);
       toDoList todo7 = new toDoList(11,"paint",false);

       list.addFirstTask(todo7);
       list.addFirstTask(todo1);
       list.addFirstTask(todo2);
       list.addLastTask(todo5);
       list.addLastTask(todo3);
       list.addLastTask(todo4);
       list.addLastTask(todo6);
       
      
      System.out.println("first "+list.First());
      System.out.println("last "+list.Last());
      System.out.println("-----------------------------------------------------------");
         System.out.println("Deleted task "+list.deleteTask(7));
         System.out.println("New first task "+list.First());
         System.out.println("-----------------------------------------------------------");

        System.out.println("Deleted task "+list.deleteTask(10));
        System.out.println("New last task "+list.Last());
      System.out.println("-----------------------------------------------------------");

         list.searchTask(5);
         list.searchTask(13);
         System.out.println("-----------------------------------------------------------");
      
          Iterator <toDoList> it= list.completed();
       while(it.hasNext()){
           System.out.println(it.next());
        }
         
       System.out.println("-----------------------------------------------------------");

          Iterator <toDoList> it1= list.notCompleted();
       while(it1.hasNext()){
           System.out.println(it1.next());
        }
        
       
        
        
    }    
    
}



