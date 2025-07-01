/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure_a2;

import java.util.Iterator;


 public class SingleLinkedList1 <T>  {

    //Nested class
    private static class Node<T>{
        private T task;
        private Node<T> next;
        
        public Node(T task, Node<T> next){
           this.task=task;
           this.next=next;
        }
        //set and get for inner class attributes
         public T getTask(){
           return this.task;
       }
       public Node<T> getNext(){
           return this.next;
       }
       public void setNext(Node<T> next){
           this.next=next;
       }
       
       }

       private Node<T> headTask;
       private Node<T> tailTask;
       private int size;
      
       public SingleLinkedList1(){
           headTask=null;
           tailTask=null;
           size=0;
       }
       
        public int size(){
            return this.size;
        }
        public boolean isEmpty(){
            return this.size==0;
        }

//      first task
        public T First(){
            if(isEmpty()){
                return null;
            }
            return headTask.getTask();
        }

        //last task
        public T Last(){
            if(isEmpty()){
                return null;
            }
            return tailTask.getTask();
        }
        
        //add first task
        public void addFirstTask(T task){
           Node<T> newNode = new Node(task, null);
               if(this.isEmpty()){
                   headTask=newNode;
                   tailTask=headTask;
           }
               newNode.setNext(headTask);
               headTask=newNode;
               size++;
       }
       
        //add last task
       public void addLastTask(T task){
           Node<T> newNode = new Node(task, null);
       if(isEmpty()){
          tailTask=newNode;
        tailTask = headTask;
       }else{
           
           tailTask.setNext(newNode);
           tailTask = newNode;
       }
       size++;
    }

        
        
       public T deleteTask(int taskId){
           //first
           if(isEmpty())
               return null;
           
           if(((toDoList)headTask.getTask()).getTaskId()==taskId){
          T task = headTask.getTask();
        headTask = headTask.getNext();
        size--;
        if(size==0)
            tailTask=null;
        return task;
           }
        //last
        if(isEmpty())
            return null;
         
          if(headTask == tailTask && ((toDoList)tailTask.getTask()).getTaskId()==taskId){
          T task = tailTask.getTask();
          headTask = null;
          tailTask = null;
          size =0;
          return task;
          }
          Node<T> prevNode = headTask;
          while(prevNode.getNext()!=tailTask){
              prevNode = prevNode.getNext(); //i++
          }
         T task = tailTask.getTask();
         prevNode.setNext(tailTask.getNext());
         tailTask = prevNode;
         size--;
         return task;
 }
       
       
         //print completed status
      public Iterator<toDoList> completed (){
          return new Iterator<toDoList>(){
            Node<T> task = headTask;
       @Override
      public boolean hasNext() {
          while(task != null && !((toDoList)task.getTask()).isCompleted()){
              task = task.getNext();
          }
         return task!=null;
      }
  
       @Override
        public toDoList next() {
            toDoList t = (toDoList)task.getTask();
            task=task.next;
            return t;
       }
            
          };
      }
      
      
          public Iterator<toDoList> notCompleted(){
          return new Iterator<toDoList>(){
            Node<T> task = headTask;
       @Override
      public boolean hasNext() {
          while(task != null && ((toDoList)task.getTask()).isCompleted()){
              task = task.getNext();
          }
         return task!=null;
      }
  
       @Override
        public toDoList next() {
            toDoList t = (toDoList)task.getTask();
            System.out.println("Task "+t.getTaskName()+" is not completed yet");
            task=task.getNext();
            return t;
       }
           
          };
          
          }
          
        public void searchTask(int taskId){
            Node<T> t1 = headTask;
            while(t1 != null){
                toDoList task = (toDoList)t1.getTask();
                if(task.getTaskId() == taskId){
                    System.out.println("Task name: "+ task.getTaskName()+" Task status completed "+task.getComplete());
                    return;
                }
                t1 = t1.getNext();
            }
            System.out.println("Task are not found");
        }
          
          
          
          
          
          
          
          
          
 }
          
          
          
          
    
 
  
       

       

