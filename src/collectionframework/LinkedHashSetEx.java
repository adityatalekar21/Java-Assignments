package collectionframework;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
	    
		LinkedHashSet <String> linkedhashset = new LinkedHashSet<String>();
		//starting name can be change only with set because it is it's parent class
		
//		LinkedHashSet is a collection that stores unique elements and remembers
//		the order they were added
		
		linkedhashset.add(null);
		linkedhashset.add("Aditya");
		linkedhashset.add("Kishor");
		linkedhashset.add("Hii");
		
		System.out.println(linkedhashset);

	}

}
