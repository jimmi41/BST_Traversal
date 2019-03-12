
public class BinNode<E extends Comparable<E>> {
	E element;
	BinNode<E> leftChild;
	BinNode<E> rightChild;
	BinNode<E> parent;
	
	BinNode(E e){
		element = e;
		leftChild = null;
		rightChild = null;
		parent = null;
	}
	
	BinNode<E>getLeftChild(){return leftChild;}
	BinNode<E>getRightChild(){return rightChild;}
	BinNode<E>getParent(){return parent;}
	E getElement() {return element;}
	
	void setLeftChild(BinNode<E> b) { leftChild = b;}
	void setRightChild(BinNode<E> b) { rightChild = b;}
	void setParent(BinNode<E> b) { parent = b;}
	
	public String toString() {
		String s = "This node contains "+ element.toString();
		return s;
	}

}
