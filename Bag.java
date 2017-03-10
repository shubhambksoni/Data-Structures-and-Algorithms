import java.util.Iterator;

public class Bag<Key extends Comparable<Key>> implements Iterable<Key>{
  Node first;
  int count=0;
  private class Node{
	  Key item;
	  Node next;
  }
  public boolean isEmpty(){
	  return first==null;
  }
  
  public int size(){
	  return count;
  }
  
  public void add(Key k){
	  Node old=first;
	  first=new Node();
	  first.item=k;
	  first.next=old;
	  count++;
  }

@Override
public Iterator<Key> iterator() {
	// TODO Auto-generated method stub
	return new ListIterator();
}

public class ListIterator implements Iterator<Key>{
	private Node current=first;
	public boolean hasNext(){
		return current!=null;
	}
	public void remove(){}
	public Key next(){
		Key i=current.item;
		current=current.next;
		return i;
	}
}
  
  
}
