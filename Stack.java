import java.util.Iterator;



public class Stack<Key extends Comparable<Key>> implements Iterable<Key> {
    Node first;
    
    private class Node{
    	Key key;
    	Node next;
    }
    
    public boolean isEmpty(){
    	return first==null;
    }
    
    public void push(Key x){
    	Node oldfirst=first;
    	first=new Node();
    	first.key=x;
    	first.next=oldfirst;
    }
    
    public Key pop(){
    	Key ret=first.key;
    	first=first.next;
    	return ret;
    } 
    
    public Iterator<Key> iterator(){
    	return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Key>{
    	private Node current=first;
    	
    	@Override
    	public boolean hasNext(){
    		return current!=null;
    	}
    	
    	public void remove(){}
    	
		@Override
		public Key next() {
			Key key=current.key;
			current=current.next;
			return key;
		}
    }
}