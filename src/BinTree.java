
public class BinTree <E extends Comparable<E>> {
	
	BinNode<E> root;
	
	BinTree(E e){
		root = new BinNode<E>(e);
	}
	
	public BinNode<E>getRoot(){return root;}
	public void setRoot(E e) {root = new BinNode<E>(e);}
	
	
	public void insert(E e) {
		insert(e,root);
	}
	
	public void insert(E e, BinNode<E> bn) {
		if (e.compareTo(bn.getElement()) < 0) {
			if(bn.getLeftChild()==null) {
				BinNode<E> n = new BinNode<E>(e);
				n.setParent(bn);
				bn.setLeftChild(n);
			}
			else {
				insert(e,bn.getLeftChild());
			}
			
		}
		else {
			if(bn.getRightChild()==null) {
				BinNode<E> n = new BinNode<E>(e);
				n.setParent(bn);
				bn.setRightChild(n);
			}
			else {
				insert(e,bn.getRightChild()); //this line was getLeftChild - I debugged the code and found that it only traversed down a node's left child if the nodes children were not null.
			}
		}
		
	}
	/*
	 * Source: https://javabeat.net/binary-search-tree-traversal-java/
	 * 
	 * only used above source for preOrder code (did the rest on my own)
	 */
	public void preOrder() {
		printPreOrder(root);
	}
	
	private void printPreOrder(BinNode<E> bn) {
		if(bn == null) {
			return;
		}
		System.out.println(bn.getElement());
		printPreOrder(bn.getLeftChild());
		printPreOrder(bn.getRightChild());
	}
	
	
	
	
	public void inOrder() {
		printInOrder(root);
	}
	
	private void printInOrder(BinNode<E> bn) {
		if(bn == null) {
			return;
		}
		printInOrder(bn.getLeftChild());
		System.out.println(bn.getElement());
		printInOrder(bn.getRightChild());
	}
	
	
	
	public void postOrder() {
		printPostOrder(root);
	}
	
	private void printPostOrder(BinNode<E> bn) {
		if(bn == null) {
			return;
		}
		printPostOrder(bn.getLeftChild());
		printPostOrder(bn.getRightChild());
		System.out.println(bn.getElement());

	}
	
	
	//Source for find function: https://www.sanfoundry.com/java-program-search-element-binary-search-tree/
	
	public boolean find(E e) {
		return find(e,root);
	}
	
	private boolean find(E e, BinNode<E> bn) {
		
		boolean found = false;
		
		while((bn != null) && !found) {
		
			if(bn.getElement() == e) {
				found = true;
				break;
			}
			if(e.compareTo(bn.getElement()) < 0){
					bn = bn.getLeftChild();
			}
			else if(e.compareTo(bn.getElement()) > 0) {
				bn = bn.getRightChild();
			}
			found = find(e, bn);
		}
		return found;
		
		
	}
}
