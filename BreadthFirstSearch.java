
public class BreadthFirstSearch {
	private boolean[] marked;
	private int[] edgeTo;
	private final int s;
	public BreadthFirstSearch(Graph g,int v){
		this.s=v;
		marked=new boolean[g.size()];
		edgeTo=new int[g.size()];
		bfs(g,s);
	}
	public void bfs(Graph g,int s){
		Queue<Integer> q=new Queue<>();
		q.enqueue(s);
		marked[s]=true;
		while(!q.isEmpty()){
			int i=q.dequeue();
			for(int j:g.adj[i]){
				if(!marked[j]){
					q.enqueue(j);
					marked[j]=true;
					edgeTo[j]=i;
				}
			}
		}
	}
	public boolean hasPathTo(int v){
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v){
		Stack<Integer> stk=new Stack<>();
		for(int x=v;x!=s;x=edgeTo[x]){
			stk.push(x);
		}
		stk.push(s);
		return stk;
	}
	
}
