
public class Word {
String word;
String definition;
public Word(String word, String definition) {
	super();
	this.word = word;
	this.definition = definition;
}
public Word() {
}
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public String getDefinition() {
	return definition;
}
public void setDefinition(String definition) {
	this.definition = definition;
}
@Override
public String toString() {
	return "Word: " + word + " Definition: " + definition ;
}
}
