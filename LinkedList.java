class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;
		Node(int a)
		{
			data = a;
			next = null;
		}
	}
	void duplicates()
	{
		Node p1 = null, p2 = null, dup = null;
		p1 = head;
		while (p1 != null && p1.next != null) {
			p2 = p1;
			while (p2.next != null) {
				if (p1.data == p2.next.data) {
					p2.next = p2.next.next;
					System.gc();
				}
				else  {
					p2 = p2.next;
				}
			}
			p1 = p1.next;
		}
	}
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList z = new LinkedList();
		z.head = new Node(15);
		z.head.next = new Node(16);
		z.head.next.next = new Node(15);
		z.head.next.next.next = new Node(16);
		z.head.next.next.next.next = new Node(16);
		z.head.next.next.next.next.next = new Node(15);
		z.head.next.next.next.next.next.next= new Node(11);
		System.out.println("Linked List before removing duplicates : ");
		z.printList(head);
		z.duplicates();
		System.out.println("\n");
		System.out.println("Linked List after removing duplicates : ");
		z.printList(head);
	}
}