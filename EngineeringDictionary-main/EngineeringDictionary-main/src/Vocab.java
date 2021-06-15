import java.util.LinkedList;
import java.util.Scanner;

public class Vocab {
    
    public static void main(String args[]) 
    { 
		
        LinkedList<String> ll 
            = new LinkedList<>(); 
        Word word = new Word( "abend", "The unexpected failure of a piece of computer software");
        Word word2 = new Word("algorithm", " A step-by-step procedure for solving a problem or accomplishing some end");
        Word word3 = new Word("anti-aliasing", "A procedure used in digital graphics processing for smoothing lines and removing visual distortions");
        Word word4 = new Word("api", "A set of rules that allows programmers to develop software for a particular operating system without having to be completely familiar with that operating system");
        Word word5 = new Word("back end", "The part of a software system that is not visible or accessible to a user of that system");
        Word word6 = new Word("bootstrap", "A looped strap sewed at the side or the rear top of a boot to help in pulling it on");
        Word word7 = new Word("checksum", "A sum derived from the bits of a segment of computer data that is calculated before and after transmission or storage to assure that the data is free from errors or tampering");
        Word word8 = new Word("codec", "A device or software system that can digitize and often compress an audio or video signal for transmission (as over a telephone line) and convert an incoming signal to audio or video for reception");
        Word word9 = new Word("compiler", "A computer program that translates an entire set of instructions written in a higher-level symbolic language into machine language before the instructions can be executed");
        Word word10 = new Word("database", "A usually large collection of data organized especially for rapid search and retrieval");
        Word word11 = new Word("debug", "Identify and remove errors from (computer hardware or software)");
        Word word12 = new Word("exception", "Aan error or unexpected event that happens while a program is running.");
        Word word13 = new Word("firmware", "Firmware is a software program or set of instructions programmed on a hardware device.");
        Word word14 = new Word("gui", "Stands for \"Graphical User Interface. It is a user interface that includes graphical elements, such as windows, icons and buttons");
        Word word15 = new Word("parameter", "a parameter or argument is a value that is passed into a function.");
        Word word16 = new Word("register", "A register is a temporary storage area built into a CPU.");
        Word word17 = new Word("runtime", "Runtime is the period of time when a program is running.");
        Word word18 = new Word("thumbnail", "A thumbnail image is a small image that represents a larger one.");

        
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
        ll.add(word12.toString());
        ll.add(word13.toString());
        ll.add(word14.toString());
        ll.add(word15.toString());
        ll.add(word16.toString());
        ll.add(word17.toString());
        ll.add(word18.toString());
        // Using the Get method and the 
        // for loop 
        for (int i = 0; i < ll.size(); i++) { 
//            System.out.println(ll.get(i)); 
        } 
        BinarySearchTree bst = new BinarySearchTree();
        // Using the for each loop 
        for (String str : ll) {        	
    		bst.addNode(str);
        }
//        To control the bst is true or not       
//        System.out.println("inorder");
//        bst.traverseInOrder();
        System.out.println("WELCOME TO THE ENGINEERING DICTIONARY");
        try {
        	Thread.sleep(1100);
        }catch (InterruptedException e) {
			e.printStackTrace();
		}
        boolean valid = false;
        while(!valid) {
        	System.out.println("Which Word Are You Looking For? ");
        	Scanner a = new Scanner(System.in);
        	String input = a.nextLine();
            bst.search(input);
        boolean hasLowercase = !input.equals(input.toUpperCase());
        
        if(!hasLowercase || Character.isUpperCase(input.charAt(0))) {
        	System.out.println("All of the characters must be written with lowercase \n Please rewrite the word with lowercase letters");
        }
       }
        }
    public static String getInput() {
    	Scanner s = new Scanner(System.in);
    	String inputString = s.nextLine();
    	return inputString;
    }
}

