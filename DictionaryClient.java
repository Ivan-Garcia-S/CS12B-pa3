// Dictionary client that tests functionality of the Dictionary ADT
public class DictionaryClient{

	   public static void main(String[] args){
	      String v;
	      Dictionary A = new Dictionary();
	      A.insert("1","a");
	      A.insert("2","b");
	      A.insert("3","c");
	      A.insert("4","d");
	      A.insert("5","e");
	      A.insert("6","f");
	      A.insert("7","g");
	      System.out.println(A);

	      v = A.lookup("1");
	      System.out.println("key=1 "+(v==null?"not found":("value="+v)));
	      v = A.lookup("3");
	      System.out.println("key=3 "+(v==null?"not found":("value="+v)));
	      v = A.lookup("7");
	      System.out.println("key=7 "+(v==null?"not found":("value="+v)));
	      v = A.lookup("8");
	      System.out.println("key=8 "+(v==null?"not found":("value="+v)));
	      System.out.println();

	      A.delete("1");
	      A.delete("3");
	      A.delete("7");
	      System.out.println(A);

	      System.out.println(A.isEmpty());
	      System.out.println(A.size());
	      A.makeEmpty();
	      System.out.println(A.isEmpty());
	      System.out.println(A);

	   }
	}
