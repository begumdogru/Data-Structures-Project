public class BinarySearchTree {
 
    private String data;
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public BinarySearchTree(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
	public BinarySearchTree getLeft() {
		return left;
	}
	public void setLeft(BinarySearchTree left) {
		this.left = left;
	}
	public BinarySearchTree getRight() {
		return right;
	}
	public void setRight(BinarySearchTree right) {
		this.right = right;
	}
    public static BinarySearchTree createTree( String content ) {
        BinarySearchTree bstree = new BinarySearchTree();
        if( content != null ) {
            content = content.replaceAll("(\\w+)\\p{Punct}(\\s|$)", "$1$2");
            String[] words = content.split( " " );
            bstree = new BinarySearchTree();
            for( int i = 0; i < words.length; i++ ) {
                bstree.addNode( words[i]);
            }
        }
        return bstree;
    }
    public void addNode(String data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (this.data.compareTo(data)> 0) {
                if (this.left != null) {
                    this.left.addNode(data);
                } else {
                    this.left = new BinarySearchTree(data);
                }
            } else {
                if (this.right != null) {
                    this.right.addNode(data);
                } else {
                    this.right = new BinarySearchTree(data);
                }
            }
        }
    }
    public void traversePreOrder() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.println(this.data);
    }
    public void search(String s) {
        System.out.println();
        String requiredString = this.data.substring(s.indexOf(":")+7, this.data.indexOf("D")-1);
//       System.out.println(requiredString);
        if(requiredString.toString().equals(s.toString())) 
        {
            System.out.println(this.data);
        }
        if (this.left != null) {
            this.left.search(s);
        }
      
        if (this.right != null) {
            this.right.search(s);
//          Trying to give the message if word is not valid. 
//            couldn't fix it, prints too many messages.
//        }if(requiredString != (s.toString())) {
//        	System.out.println("This is not a valid word");
        }
       
    }
}
   
