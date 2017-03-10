
public class Graph {

	private final int v;
	public Bag<Integer>[] adj;
	public Graph(int v){
		this.v=v;
		adj=(Bag<Integer>[])new Bag[v];
		for(int i=0;i<v;i++){
			adj[i]=new Bag<Integer>();
		}
	}
	public int size(){
		return v;
	}
	
	public void addEdge(int i,int j){
		adj[i].add(j);
		adj[j].add(i);
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	
}
