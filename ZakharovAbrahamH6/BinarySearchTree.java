package binarySearchTree;

public class BinarySearchTree {
private Node root;

public BinarySearchTree(){
	root = null;
}
public void setRoot(String word){
    root = new Node(word);
}

public Node getRoot(){
    return root;
}

public void insert(String word)
{
   insert(root, word);
}

private void insert(Node node, String word)
{
   if (word.compareTo(node.getWord())<1){
   	if (node.left == null){
   	System.out.println("++Inserted " + word + " to the left of " + node.getWord());
   	 Node nodeLeft = new Node (word);
   	 node.left = nodeLeft;
   	}
   	else{
   		insert (node.left, word);
   	}
   }
   else if (word.compareTo(node.getWord())>1){
   	if (node.right == null){
   	System.out.println("++Inserted " + word + " to the right of " + node.getWord());
   	Node nodeRight = new Node (word);
      	 node.right = nodeRight;
   	}
   	else{
   		insert (node.right, word);
   	}
   }
   else if (word.compareTo(node.getWord())==1){
	   node.setCounter(node.getCounter()+1);
   }
}

public void inorder()
{
    inorder(root);
}
private void inorder(Node r)
{
    if (r!= null){
   	 inorder(r.left);
   	 System.out.printf(" " + r.getWord() + ": " + r.getCounter());
   	 inorder(r.right);
    }
}
}
