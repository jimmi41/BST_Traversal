
public class BinDriver {

	public static void main(String[] args) {
		BinTree<Integer> b = new BinTree<Integer>(50);
		b.insert(20);
		b.insert(70);
		b.insert(30);
		b.insert(60); 
		b.insert(10);
		b.insert(90);
		b.insert(0);
        b.insert(15);
		b.insert(80);
		
		System.out.println("Preorder Traversal: ");
		b.preOrder();
		System.out.println("\n");
		
		System.out.println("Inorder Traversal: ");
		b.inOrder();
		System.out.println("\n");
		
		System.out.println("Postorder Traversal: ");
		b.postOrder();
		System.out.println("\n");
		

		if (b.find(90) == true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Cannot be found");
		}
		
		if (b.find(80) == true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Cannot be found");
		}
		
		if (b.find(800) == true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Cannot be found");
		}
		
		if (b.find(1000) == true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Cannot be found");
		}
	}
	
}
