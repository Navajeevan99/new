
import java.util.Scanner;

import LinkListPack.Node;
class Node
{
	int data;
	Node next;
	Node(){
		next=null;
	}
}
class NumberList
{
	Node head;
	NumberList(){
		head=null;
	}
	void insertFirst(int i)
	{
		Node L=new Node();
		L.data=i;
		L.next=head;
		head=L;
	}
	boolean isEmpty()
	{
		if (head==null)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	void append(int i){
		Node L=new Node();
		L.data=i;
		Node current;
		if(head==null)
	        head=L;
	    else {
	            current=head;
	            while(current.next!=null){
	                current=current.next;
	         }
	            current.next=L;
	         }
	}
	void printlist() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
		}
		else
		{
			Node current =head;
			while(current!=null)
			{
				System.out.println(current.data);
				System.out.println();
				current=current.next;
			}
		}
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberList n=new NumberList();
		n.append(20);
		n.printlist();
		n.append(30);
		System.out.println("");
		n.printlist();
	}

}
