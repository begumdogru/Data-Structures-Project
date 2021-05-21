
public class Word {
String word;
String definition;
public Word(String word, String definition) {
	super();
	this.word = word;
	this.definition = definition;
}
public Word() {
	// TODO Auto-generated constructor stub
}
/**
 * @return the word
 */
public String getWord() {
	return word;
}
/**
 * @param word the word to set
 */
public void setWord(String word) {
	this.word = word;
}
/**
 * @return the definition
 */
public String getDefinition() {
	return definition;
}
/**
 * @param definition the definition to set
 */
public void setDefinition(String definition) {
	this.definition = definition;
}
@Override
public String toString() {
	return "Word: " + word + " *Definition: " + definition ;
}


}
