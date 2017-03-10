
public class Edge implements Comparable<Edge> {

	private final int v,w;
	private final double weight;
	
	public Edge(int v, int w,int weight){
		this.v=v;
		this.w=w;
		this.weight=w;
	}
	public int either(){
		return v;
	}
	public int other(int i){
		if(i==v)return w;
		else return v;
	}
	public double weight(){
		return weight;
	}
	
	@Override
	public int compareTo(Edge e) {
		// TODO Auto-generated method stub
		if(this.weight<e.weight)return -1;
		else if(this.weight>e.weight)return 1;
		else return 0;
	}
	public String toString(){
		int i=either();
		int j=other(i);
		String s=i+"->"+j;
		return s;
	}

}
