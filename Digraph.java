
public class Digraph {
  private final int v;
  private Bag<Integer>[] adj;
  public Digraph(int v){
	  this.v=v;
	  adj=(Bag<Integer>[])new Bag[v];
	  for(int i=0;i<v;i++){
		  adj[i]=new Bag<Integer>();
	  }
  }
  public void addEdge(int i,int j){
	  adj[i].add(j);
  }
  public int v(){
	  return v;
  }
  public Iterable<Integer> adj(int i){
	  return adj[i];
  }
  
}
