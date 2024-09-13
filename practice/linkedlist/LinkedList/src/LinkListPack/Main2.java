package LinkListPack;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node() {
       next = null;
    }
}


class NumberList{
	Node head;
	NumberList(){
		head=null;
	}
	
	void insertFirst(int i){
		Node L=new Node();
		L.data=i;
		L.next=head;
		head=L;
	}
boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
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
	
	void insertAfter(int y, int x){
		Node L=new Node();
		L.data=x;
		Node current=head;
		if(isEmpty()) {
			System.out.println("List is empty");
		}
	    else {
	           current=head;
	           while(current.data!=y && current.next!=null){
	                current=current.next;
	          }
	           if(current.data!=y)
	   			   System.out.println("element is not found");
	           else{
	                 L.next=current.next;
	                 current.next=L;
	       }
	    }
	}
	
	void deleteFirst(){
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			if(head.next==null)
				head=null;
			else
				head=head.next;
		}
	}
	
	void deleteLast(){
		Node temp, prev=head;
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			if(head.next==null)
				head=null;
			else {
				temp=head;
				while(temp.next!=null) {
					prev=temp;
					temp=temp.next;
				}
				prev.next=null;
			}
				
		}
	}
	
	void delete(int n){
		Node temp, prev=head;
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			if(head.data==n && head.next==null)
				head=null;
			else {
				temp=head;
				while(temp.data!=n && temp.next!=null) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data!=n)
					System.out.println("element is not found");
		           else
				prev.next=temp.next;
			}
				
		}
	}
	
	void printList() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else{
	System.out.println("List (first-->last):");
	     Node current=head;
			while(current!=null){
				System.out.println("current.data = "+current.data);
				current=current.next;
			 }
			System.out.println(" ");
	}
	}
}

public class Main2{

	public static void main(String[] args) {
	NumberList llist = new NumberList();
                Scanner sc = new Scanner(System.in);
int op, x, y;
System.out.println("1. Insertfirst \n2. Append\n3. Insert After \n4. PrintList");
System.out.println("\n 5. deletefirst \n6. deleteLast\n7. delete \n8. Exit");
while (true) {
System.out.print("Enter your option: ");
op = sc.nextInt();
switch (op) {
case 1:
System.out.print("Enter Value: ");
x = sc.nextInt();
llist.insertFirst(x);
break;

case 2:
System.out.print("Enter Value: ");
x = sc.nextInt();
llist.append(x);
break;

case 3:
System.out.print("Enter Value: ");
x = sc.nextInt();
	System.out.print("Enter data value where you want to insert after: ");
	y = sc.nextInt();
llist.insertAfter(y, x);
break;

case 4:
	System.out.print("The list is: ");
llist.printList();
break;

case 5:
llist.deleteFirst();
break;
case 6:
llist.deleteLast();
break;
case 7:
System.out.print("Enter Value to be deleted: ");
                         x = sc.nextInt();
llist.delete(x);
break;  
case 8:
return;
            }

        }

    }
	
}
