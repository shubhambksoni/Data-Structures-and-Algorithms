
public class QuickFind {
	private int[] id;
	public QuickFind(int n){
		id=new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
		}
	}
	public void union(int i,int j){
		if(!connected(i,j)){
			int x=id[i];
			int y=id[j];
			for(int k=0;k<id.length;k++){
				if(id[k]==y)id[k]=x;
			}
			
		}
	}
	public boolean connected(int i,int j){
		return id[i]==id[j];
	}
	
}
