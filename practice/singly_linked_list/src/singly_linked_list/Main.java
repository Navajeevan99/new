package singly_linked_list;

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
	void printlist()
	{
		node L=head;
		while(L!=null)
		{
			System.out.println(L.data);
			L=L.next;
		}
	}
	void  append(int i) {
		node L=new node(i);
		
		if (head==null)
		{
			head=L;
		}
		else
		{
			node n=head;
			while(n.next!=null)	
			{
				n=n.next;
			}
			n.next=L;
			
			
		}
	}
	void deletefirst()
	{
		head=head.next;
	}
	void deletelast()
	{
		node L=head,h = null;
		while(L.next!=null)
		{
			h=L;
			L=L.next;
			
		}
		h.next=null;
		
		
	}
	void delete (int n)
	{
		node l=head,l1;
		while (l.next!=null)
		{
				if (l.next.data!=n)
				{
					l=l.next;
				}
				else
				{
					l1=l.next;
					l.next=l1.next;
				}
		}
		
	}
	void insert(int x, int y)
	{
		node k=new node(x);
		node l=head,n;
		while (l.next!=null)
		{
			if (l.next.data!=y)
			{
				l=l.next;
			}
			else
			{
				n=l.next;
				l.next=k;
				l=l.next;
				l.next=n;
				
				
			}
		}
	}
	
}
public class Main {
	public static void main(String[] args)
	{
		linkedlist l=new linkedlist();
		l.insertfirst(10);
		l.insertfirst(20);
		//l.printlist();
		l.append(30);
		l.append(40);
		l.deletefirst();
		l.deletelast();
		l.insert(15,30);
		//l.delete(30);
		
		l.printlist();
		
		
	}

}
