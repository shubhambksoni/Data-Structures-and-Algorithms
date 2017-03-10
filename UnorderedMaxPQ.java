public class UnorderedMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;
	
    public UnorderedMaxPQ(int capacity){
    	pq=(Key[])new Comparable[capacity];
    }
    
    public boolean isEmpty(){
    	return N==0;
    }
    
    public void insert(Key x){
    	pq[N++]=x;
    }
    
    public Key delMax(){
    	int max=0;
    	for(int i=1;i<N;i++){
    		if(pq[max].compareTo(pq[i])<0)max=i;
    	}
    	exch(pq,max,N-1);
    	return pq[--N];
    }
    private void exch(Key[] a,int i,int j){
    	Key k=a[i];
    	a[i]=a[j];
    	a[j]=k;
    }
}
