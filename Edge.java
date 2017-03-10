
public class TopologicalSort {
  private boolean[] marked;
  private Stack<Integer> stack=new Stack<>();
  
  public TopologicalSort(Digraph g){
	  marked=new boolean[g.v()];
	  for(int i=0;i<g.v();i++){
		  if(!marked[i]){
			  dfs(g,i);
		  }
	  }
  }
  private void dfs(Digraph g,int i){
	  marked[i]=true;
	  for(int w:g.adj(i)){
		  if(!marked[w])dfs(g,w);
	  }
	  stack.push(i);
  }
  public Iterable<Integer> stack(){
	  return stack;
  }
}
