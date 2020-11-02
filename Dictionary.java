public class Dictionary implements DictionaryInterface{
	Node head;
	Node tail;
	
	Dictionary(){
		head = null;
		tail = head;
	}
	
	private class Node{
		String key, value;
		Node next;
		
		Node(String k, String v){
			key = k;
			value = v;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		int cnt = 0;
		Node temp = head;
		
		while(temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}
	
	public String lookup(String key) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.key.equals(key)){
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void insert(String key, String value) throws DuplicateKeyException {
		Node temp = head;
		if(lookup(key) == null) {
			
			if(head == null) {
				head = new Node(key,value);
				tail = head;
			}
			else {
				if(tail == head) {
					head.next = new Node(key,value);
					tail = head.next;
				}
				else {
					tail.next = new Node(key,value);
					tail = tail.next;
				}
			}
		}
		else {
			throw new DuplicateKeyException("cannot insert duplicate keys");
		}
	}
	
	public void delete(String key) throws KeyNotFoundException{
		Node temp = head;
		boolean found = false;
		
	//	if(head != null) {
	//	if(head.key.equals(key))
		if(head!=null){
			if( head.key.equals(key)) {
		
			head = head.next;
			found = true;
			}
	//	}
		else {
		while(temp.next != null && temp.next != tail && !found) {
			if(temp.next.key.equals(key)) {
				temp.next = temp.next.next;
				found = true;
			}
			//
			 
		if(!found)	temp = temp.next;
		}
			if(tail.key.equals(key)) {
				tail = temp;
				tail.next = null;
				found = true;
		}
	
		}
		}
		if(!found){
			throw new KeyNotFoundException("cannot delete non-existent key");	
		}
	}
	
	public void makeEmpty() {
		head = null;
		tail = head;
	}
	
	public String toString() {
		Node temp = head;
		String dict = "";
		while(temp != null) {
			dict += temp.key + " " + temp.value + System.lineSeparator();
			temp = temp.next;
		}
		return dict;
	}
	
	
}
