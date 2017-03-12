
public class KruskalMST {
	private Queue<Edge> mst=new Queue<>();
	public KruskalMST(EdgeWeightedGraph g){
		MinHeapPQ<Edge> pq=new MinHeapPQ<>();
		for(Edge e:g.edges()){
			pq.insert(e);
		}
		QuickFind qf=new QuickFind(g.v());
		while(!pq.isEmpty() && mst.size()<g.v()-1){
			Edge e=pq.delMin();
			int v=e.either();int w=e.other(v);
			if(!qf.connected(v, w)){
				qf.union(v, w);
				mst.enqueue(e);
			}
		}
	}
	public Iterable<Edge> edges(){
		return mst;
	}
}
