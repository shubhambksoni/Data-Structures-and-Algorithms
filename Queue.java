import java.util.Iterator;

public class Queue<Key extends Comparable<Key>> implements Iterable<Key> {
	Node first,last;
	
	private class Node{
		Key item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void enqueue(Key x){
		Node old=last;
		last=new Node();
		last.item=x;
		last.next=null;
		if(isEmpty()){
			first=last;
		}else{
			old.next=last;
		}
	}
	
	public Key dequeue(){
		Key i=first.item;
		first=first.next;
		if(isEmpty())last=null;
		return i;
	}
	
	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Key>{
        Node current=first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Key next() {
			// TODO Auto-generated method stub
			Key i=current.item;
			current=current.next;
			return i;
		}
}

}
