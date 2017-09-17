/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dougrandomstack;

/**
 *
 * @author Doug
 */
public class RandomStackList {
    RandomStackNode head;    //Head of list
    private int size;
 
    //Inserts a new node at the front of the list
    public void push(int new_data)
    {
        //Allocate new node and putting data
        RandomStackNode new_node = new RandomStackNode(new_data);
 
        //Make next of new node as head
        new_node.next = head;
 
        //Move the head to point to new Node
        head = new_node;
        size++;
    }
    //checks size of linked list
    public int getSize()
    {
        return size;
    }
      //Checks whether the value x is present in linked list
    public boolean search(RandomStackNode head, int x)
    {
        RandomStackNode current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }
    
}
