/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure_a2;

/**
 *
 * @author VICTUS
 */
public class DoubleSong {
    
     public static void main(String[] args) {
         
         DoublyLinkedList1 d = new DoublyLinkedList1();
          d.addFirst(1, "Number one girl", "Rose");             
          d.addFirst(2, "Summaretime ", "Lana del ray");
          d.addLast(3, "Dusk till dawn", "Zain Malik");
          d.addLast(4, "Wildflower", "Billie Eilish");
          d.addLast(5, "Dynasty", "Miia");

          d.currentSong("Wildflower");
          d.afterCurrentSong(6, "ya ana", "Fairoz");
           System.out.println("-----------------------------------------------");
           
         d.currentSong("Dynasty");
         d.nextSong();
          System.out.println("-----------------------------------------------");

         d.currentSong("Dusk till dawn");
         d.prevSong();
          System.out.println("-----------------------------------------------");

         d.currentSong("Wildflower");
         d.removeCurrent();
          System.out.println("-----------------------------------------------");

         d.searchSong("Dynasty");
         d.searchSong("perfect");
        System.out.println("-----------------------------------------------");
        
        d.currentSong("Number one girl");
        d.printCurrent();


      



     }
    
    
    
    
    
    
    
    
    
    
    
}
