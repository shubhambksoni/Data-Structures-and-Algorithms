
public class DepthFirstSearch {
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
public DepthFirstSearch(Graph g,int s){
	this.s=s;
	marked=new boolean[g.size()];
	edgeTo=new int[g.size()];
	dfs(g,s);
}

private void dfs(Graph g,int s){
		marked[s]=true;
		for(int x:g.adj[s]){
			if(!marked[x]){
				dfs(g,x);
				edgeTo[x]=s;
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
