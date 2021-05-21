import java.util.LinkedList;
import java.util.Scanner;

public class Vocab {
    
    public static void main(String args[]) 
    { 
		
        LinkedList<String> ll 
            = new LinkedList<>(); 
        Word word = new Word("abend", "the unexpected failure of a piece of computer software");
        Word word2 = new Word("algorithm", " a step-by-step procedure for solving a problem or accomplishing some end");
        Word word3 = new Word("anti-aliasing", "a procedure used in digital graphics processing for smoothing lines and removing visual distortions");
        Word word4 = new Word("api", "a set of rules that allows programmers to develop software for a particular operating system without having to be completely familiar with that operating system");
        Word word5 = new Word("back end", "the part of a software system that is not visible or accessible to a user of that system");
        Word word6 = new Word("bootstrap", "a looped strap sewed at the side or the rear top of a boot to help in pulling it on");
        Word word7 = new Word("checksum", "a sum derived from the bits of a segment of computer data that is calculated before and after transmission or storage to assure that the data is free from errors or tampering");
        Word word8 = new Word("codec", "a device or software system that can digitize and often compress an audio or video signal for transmission (as over a telephone line) and convert an incoming signal to audio or video for reception");
        Word word9 = new Word("compiler", "a computer program that translates an entire set of instructions written in a higher-level symbolic language into machine language before the instructions can be executed");
        Word word10 = new Word("database", "a usually large collection of data organized especially for rapid search and retrieval");
        Word word11 = new Word("deadlock", "a state of inaction or neutralization resulting from the opposition of equally powerful uncompromising persons or factions");

        ll.add(word.toString());
        ll.add(word2.toString());
        ll.add(word3.toString());
        ll.add(word4.toString());
        ll.add(word5.toString());
        ll.add(word6.toString());
        ll.add(word7.toString());
        ll.add(word8.toString());
        ll.add(word9.toString());
        ll.add(word10.toString());
        ll.add(word11.toString());
        // Using the Get method and the 
        // for loop 
        for (int i = 0; i < ll.size(); i++) { 
    
            System.out.println(ll.get(i)); 
        } 
        BinarySearchTree bst = new BinarySearchTree();
        // Using the for each loop 
        for (String str : ll) {        	
    		bst.addNode(str);
        }
//        To control the bst is true or not       
//        System.out.println("inorder");
//        bst.traverseInOrder();
//        

        System.out.println("Which Word Are You Looking For? ");
        bst.search(getInput());
    
        
    }
    public static String getInput() {
    	Scanner s = new Scanner(System.in);
    	String inputString = s.nextLine();
    	if(Character.isUpperCase(inputString.charAt(0))){
    		System.out.println("Please enter all words with a lowercase!");
    	}
    	else {
    		System.out.println("Searching...");
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return inputString;
    }
}

