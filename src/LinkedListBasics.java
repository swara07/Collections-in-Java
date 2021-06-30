
public class LinkedListBasics {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void printMyList() {
		
		Node n=head;
		while (n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public static void main(String[] args) {
		
		LinkedListBasics o=new LinkedListBasics();
		
		Node first=o.new Node(10);
		
		o.head=first;
		
		Node second= o.new Node(20);
		first.next=second;
		
		o.printMyList();
		

	}

}
