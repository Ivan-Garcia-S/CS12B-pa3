//Test client for the Dictionary ADT
public class DictionaryTest {

	public static void main(String[] args) {
		 Dictionary D = new Dictionary();
		 
		 System.out.println(D.isEmpty());
		 D.insert("1", "blue");
		 D.insert("2", "red");
		 D.insert("3", "green");
		 System.out.println(D.size());
		 // System.out.print(D.head);
		
		 System.out.println(D.toString());
		 D.delete("1");
		 System.out.println(D.size());
		
		 System.out.println(D.toString());
		 D.insert("1", "blue");
	         // System.out.println(D.size());

		 D.delete("3");
		 System.out.println(D.size());
		 System.out.println(D.toString());

		 D.insert("4", "yellow");
		 D.insert("5", "purple");
		 System.out.println(D.toString());
		 // System.out.println(D.tail.toString());
		 
		 // D.delete("5");
	         // System.out.println(D.toString());
		 
		 D.delete("4");
		 System.out.println(D.toString());
		 D.delete("5");
		
		 D.delete("2");
		 System.out.println(D.toString());
		 D.delete("1");
	         System.out.println(D.toString());
	}

}
