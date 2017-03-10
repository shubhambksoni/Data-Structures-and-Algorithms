
public class BinaryHeapPQ<Key extends Comparable<Key>>{
     Key[] pq;
     private int N=0;
     
     public BinaryHeapPQ(int capacity){
    	 pq=(Key[])new Comparable[capacity];
     }
     
     public void insert(Key x){
    	 pq[++N]=x;
    	 swim(N);
     }
     
     public Key delMax(){
    	 Key max=pq[1];
    	 exch(1,N--);
    	 pq[N+1]=null;
    	 sink(1);
    	 return max;
    	 
     }
     
     public void swim(int i){
    	 while(i>1){
    		 if(pq[i].compareTo(pq[i/2])<0)break;
    		 exch(i,i/2);
    		 i=i/2;
    	 }
    	 
     }
     
     public void sink(int k){
    	 while(2*k<=N){
    		int j=2*k;
    		if(j<N && pq[j].compareTo(pq[j+1])<0)j++;
    		if(pq[k].compareTo(pq[j])>0)break;
    		exch(k,j);
    		k=j;
    	 }
    	 
     }
     
     public boolean isEmpty(){
    	 return N==0;
     }
     public void exch(int i,int j){
    	 Key k=pq[i];
    	 pq[i]=pq[j];
    	 pq[j]=k;
     }
	
}
