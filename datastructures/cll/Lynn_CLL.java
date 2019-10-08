/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frostburg.cosc310.datastructures.cll;

import edu.frostburg.cosc310.datastructures.cll.CLL;

/**
 *
 * @author lduni_9i7sxd7
 */
public class Lynn_CLL implements CLL {
   
    

    /**
     * @param args the command line arguments
     */
    
    public class CLLNode{
    
    public Object data; 
    CLLNode next;
    
    public CLLNode(Object d){
        data = d;
        }
    
    }
    
    private CLLNode head;
    private CLLNode tail;
    private int size;
    /**
	 * The default constructor.
	 */
    public Lynn_CLL(){
            head = null;
            size = 0;
    }
	
        /**
         * The size method
         * @return the number of elements in the list.
         */
    public int size(){
     return size;   
    }

    public boolean add (Object d){

        
        if(isEmpty())
            {
                
                head = tail = new CLLNode(d); 
                size++;
                return true;
            }

            tail.next = new CLLNode(d); 
            tail = tail.next;
            tail.next = head;
            size++;

            return true;
    }

    public boolean remove(Object element){
            if(isEmpty() || head == null) {
                return false;
            }
                
            if(head == tail){
                head = tail = null;
                size--;
                return true;
            }
            
            head = head.next;
            tail.next = head;
            size--;
            
            return true;
    }
	
        public void rotate(){
            head = head.next;
            tail = tail.next;
        }
	
        
        /**
	 * Checks if the list is empty
	 * @return			true if empty, false if not
	 */
	public boolean isEmpty() {
            return head == null;
	}
        
        public String myName(){
            return "My name is Lynn Dunigan, and I did my best for this project.";
        }
        
	
	/**
	 * Formats the list nodes into a string
	 * @return			The result string.
	 */
	@Override
        public String toString() {
		String animal = "";
                animal += head.data; 
                return animal;
                
	}
}
