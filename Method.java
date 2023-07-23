import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Node {
	int key;
	Node next;

	public Node(int key) {
		this.key = key;
		next = null;
	}
}
public class Method {
	public static Node newNode(int key) {
		return new Node(key);
	}
    	public static void main(String[] args) {
		Node m = new Node(6);
		m.next = new Node(21);
		m.next.next = new Node(11);
		m.next.next.next = new Node(23);
		Node n = new Node(3);
		n.next = new Node(2);
		n.next.next = new Node(22);
		List<Integer> s = new ArrayList<>();
		while (m != null) {
			s.add(m.key);
			m = m.next;
		}
		while (n != null) {
			s.add(n.key);
			n = n.next;
		}
		Collections.sort(s);
		Node result = new Node(-1);
		Node temp = result;
		for (int i = 0; i < s.size(); i++) {
			result.next = new Node(s.get(i));
			result = result.next;
		}
		temp = temp.next;
		System.out.print("Resultant Merge Linked List is : ");
		while (temp != null) {
			System.out.print(temp.key + " ");
			temp = temp.next;
		}
	}
}