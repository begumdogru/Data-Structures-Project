import java.util.Iterator;
import java.util.ListIterator;
public abstract class LinkedList  {
	protected static Node first;
	private Node last;
	public LinkedList() {
		super();
		this.first = null;
		this.last = null;
	}
	public boolean isEmpty() {
		return(first == null);
	}
	public void wordList() {
		Node current = first;
		while(current != null) {
			System.out.println(current.getWord());
			current = current.getLink();
		}
	}
	public static Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
}