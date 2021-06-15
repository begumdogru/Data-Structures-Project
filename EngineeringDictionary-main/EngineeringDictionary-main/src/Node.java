
public class Node {
	private static String word;
	private static String definition;
	private Node link;
	public Node() {
		link = null;
		word = null;	
	}
	public Node(String newWord) {
		setWord(newWord);
		link = null;
	}
	public Node(String newWord, Node linkValue) {
		setWord(newWord);
		link = linkValue;
	}
	public Node(String newWord, String newDefinition, Node linkValue) {
		setWord(newWord, newDefinition);
		link = linkValue;
	}
	public Node(String newWord, String newDefinition) {
		setWord(newWord, newDefinition);
		
	}
	@Override
	public String toString() {
		return "Node [word=" + word + ", link=" + link + "]";
	}
	public static String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public static String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public void setWord(String word, String definition) {
		this.word = word;
		this.definition = definition;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}	
}
