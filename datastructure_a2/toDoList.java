/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure_a2;

/**
 *
 * @author VICTUS
 */
  public class toDoList {
    
    private int taskId;
    private String taskName;
    private boolean complete;
    

    public toDoList(int taskId, String taskName, boolean complete){
        this.taskId=taskId;
        this.taskName=taskName;
        this.complete=complete;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }
   
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public boolean getComplete(){
        return complete;
    }
  
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
     
    public boolean isCompleted(){
        return this.complete;
    }
    @Override
    public String toString(){
        return "task id= "+this.getTaskId()+"  task name: "+this.getTaskName()+"  completed? "+this.isCompleted();
    }
    
}
