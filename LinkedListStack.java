package dataStructuresAssignmnet;

import java.util.*;

public class LinkedListStack
{
  Node head;
  
  class Node
  {
	  int value;
	  Node next;
  }
  public LinkedListStack()
  {
	  head=null;
  }
  
  public void push(int value)
  {
	  Node extraHead = head;
	  head = new Node();
	  head.value=value;
	  head.next= extraHead;
  }
  public int pop()
  {
	  if(head==null)
	  {
		  System.out.println("stack is empty :");
	  }
	  int value = head.value;
	  head = head.next;
	  return value;
  }
	  public static void printRemainingList(Node head)
	  {
		  Node temp = head;
		  while(temp!=null)
		  {
			  System.out.println(temp.value +" ");
			  temp = temp.next;
		  }
  }
    public static void main(String[] args)
    {
	   LinkedListStack ls = new LinkedListStack();
	   ls.push(10);
	   ls.push(20);
	   ls.push(30);
	   ls.push(40);
	   ls.push(50);
    System.out.println("element removed from the stack are :"+ ls.pop());
    System.out.println("element removed from the stack are :"+ ls.pop());
   
	ls.push(60);
	System.out.println("element removed from the stack are :"+ ls.pop());
	printRemainingList(ls.head);
	}
  
  
  
}
