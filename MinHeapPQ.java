
public class MinHeapPQ<Key extends Comparable<Key>>{
   private Key[] pq=(Key[])new Object[2];
   private int N=0;
   
   public void insert(Key i){
	   if(N==pq.length-1){
		   resize(pq.length*2);
		   pq[++N]=i;
		   swim(N);
	   }else{
		   pq[++N]=i;
	   }
   }
   public Key delMin(){
	   if(N<=pq.length/4){
		   Key key=pq[1];
		   exch(1,N--);
		   sink(1);
		   resize(pq.length/2);
		   return key;
	   }else{
		   Key key=pq[N--];
		   sink(N);
		   return key;
	   }
   }
   public void swim(int k){
	   while(k>1 && pq[k/2].compareTo(pq[k])>0){
		   exch(k,k/2);
		   k=k/2;
	   }
   }
   public void sink(int k){
	   while(2*k<=N){
		   int j=2*k;
		   if(j<N && pq[j].compareTo(pq[j+1])>0){
			   j=j+1;
		   }
		   if(pq[k].compareTo(pq[j])<0)break;
		   exch(k,j);
		   k=j;
	   }
   }
   private void exch(int i,int j){
	   Key key=pq[i];
	   pq[i]=pq[j];
	   pq[j]=key;
   }
   public void resize(int k){
	   Key[] arr=(Key[])new Object[k];
	   for(int i=0;i<=N;i++){
		   arr[i]=pq[i];
	   }
	   pq=arr;
   }
}
