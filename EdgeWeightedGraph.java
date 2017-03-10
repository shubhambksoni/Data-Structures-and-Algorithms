
public class EdgeWeightedGraph {
	private final int v;
	private Bag<Edge>[] adj;
	private Bag<Edge> edges=new Bag<>();
	
	public EdgeWeightedGraph(int v){
		this.v=v;
		adj=(Bag<Edge>[])new Bag[v];
		for(int i=0;i<v;i++){
			adj[i]=new Bag<Edge>();
		}
	}
	public void addEdge(Edge e){
		int v=e.either();
		int w=e.other(v);
		adj[v].add(e);
		adj[w].add(e);
		edges.add(e);
	}
	public Iterable<Edge> adj(int v){
		return adj[v];
	}
	public int v(){
		return v;
	}
	public Bag<Edge> edges(){
		return edges;
	}
}
