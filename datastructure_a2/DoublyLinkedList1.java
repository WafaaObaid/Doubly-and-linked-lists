/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure_a2;


  public class DoublyLinkedList1 {
    
    // nested class node
       public static class Song{
       private int songId;
       private String songTitle;
       private String artistName;
       private Song next;
       private Song prev;
       
       public Song(int songId,String songTitle,String artistName,Song next, Song prev){
           this.songId=songId;
           this.songTitle=songTitle;
           this.artistName=artistName;
           this.next=next;
           this.prev=prev;
       }
       
        public int getSongId() {
            return songId;
        }
        public void setSongId(int songId) {
            this.songId = songId;
        }

        public String getSongTitle() {
            return songTitle;
        }
        public void setSongTitle(String songTitle) {
            this.songTitle = songTitle;
        }

        public String getArtistName() {
            return artistName;
        }
        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }
        public Song getNext() {
            return next;
        }
        public void setNext(Song next) {
            this.next = next;
        }
        public Song getPrev() {
            return prev;
        }

        public void setPrev(Song prev) {
            this.prev = prev;
        }
        
        @Override
     public String toString(){
         return "Song ID: "+this.getSongId()+" || Song Title: "+this.getSongTitle()+
                " ||  Artist name: "+this.getArtistName();
     }
        
    }
    
    public Song header;
    public Song tailer;
    public Song current;
    public int size=0;
    
    public DoublyLinkedList1(){
        this.header= new Song(0,null,null,null,null);
        this.tailer=new Song(0,null,null,null,header);
        header.setNext(tailer);
        tailer.setPrev(header);
    }
    
     public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
     public Song first(){
        if(isEmpty())
            return null;
        return header.getNext();
    }
    public Song last(){
        if(isEmpty())
            return null;
        return tailer.getPrev();
    }
    private void addBetween(int songTd,String songTitle,String artistName, Song successor,Song predecessor ){
        Song newNode = new Song(songTd,songTitle,artistName, successor,predecessor);
        successor.setPrev(newNode);
        predecessor.setNext(newNode);
        
        size++;
    }
    
    public void addFirst(int songId, String songTitle,String artistName){
        this.addBetween(songId,songTitle,artistName, header.getNext(), header);
    }
     public void addLast(int songId, String songTitle,String artistName){
        this.addBetween(songId,songTitle,artistName, tailer, tailer.getPrev());
    }
       public void currentSong(String songTitle){
            Song t = header.getNext();
            while(t!=tailer){
            if(t.getSongTitle().equalsIgnoreCase(songTitle)){
                current = t;
                System.out.println("Now you listen to "+current);
                return;
            }
            t=t.getNext();
            }
            System.out.println("Song is not found");
        }
     
     public void afterCurrentSong (int songId, String songTitle,String artistName){
         if(current !=null){
         Song newNode = new Song(songId,songTitle,artistName,current.getNext(),current);
          if(current.getNext() != null){
         current.getNext().setPrev(newNode);
          }else{
           tailer = newNode;
          }
          current.setNext(newNode);
          System.out.println("New song added after the current song: "+newNode);
         size++;
         }
     }
     
         public void nextSong(){
          if(current !=null){
              if(current.getNext() != null && current.getNext() != tailer){
                  current = current.getNext();
                  if(current.getNext() != null && current.getNext() != tailer){
                    current = current.getNext();
                  }
                      }else{
                  current = header.getNext();
              }
             System.out.println("Next song after the current song: "+current);
  }
  }    
         
        public void prevSong(){
            if(current != null){
                if(current.getPrev() != null && current.getPrev() != tailer){
                    current = current.getPrev();                  
                }else{
                    current = tailer.getPrev();
                }
                  System.out.println("Prev song before the current song: "+current);
                
            }
        }
         
 
         public void removeCurrent(){
              if(current != null && current != header && current != tailer){
                Song prevSong = current.getPrev();
                Song nextSong = current.getNext();
                prevSong.setNext(nextSong);
                nextSong.setPrev(prevSong);
                 System.out.println("Current song removed");
             }
             
         }
        
        public void printCurrent(){
           if(current!=null){
               System.out.println("You want to print "+current.getSongTitle()+" Artist name "+current.getArtistName());
           }
           
           
        }
        
         public void searchSong(String songTitle){
             Song t = header.getNext();
             while(t != null){
            if(t.getSongTitle()!=null && t.getSongTitle().equalsIgnoreCase(songTitle)){
                System.out.println("You search for "+t.getSongTitle());
                return;
            }
            t= t.getNext();
             }
             System.out.println("Song not found");
         }
        
       
         
         
         
         
        
        
  }