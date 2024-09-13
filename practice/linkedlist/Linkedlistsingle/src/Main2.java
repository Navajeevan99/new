import java.util.Scanner;

import LinkListPack.Node;
class node
{
	node next;
	int data;
	node(int data){
		this.data=data;
		next=null;
	}
	
}
class linkedlist
{
	node head;
	linkedlist()
	{
		head=null;
	}
	void insertfirst(int i) {
		node L=new node(i);
		if (head==null)
		{
			head=L;
		}
		else
		{
			L.next=head;
			head=L;
			
		}
		
	}
}
public class Main2 {
	public static void main(String[] args)
	{
		linkedlist l=new linkedlist();
		l.insertfirst(10);
		l.insertfirst(20);
		
	}

}
