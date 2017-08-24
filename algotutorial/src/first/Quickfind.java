package first;

public class Quickfind {
	
	public static void main(String[] args) {
		
		System.out.println(connected(1,2));
		
	}
	private int[] id;
	
	public void QuickFind(int N)
	{
		//Constructor
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}
	public boolean connected(int p, int q)
	{  
		//find if two values are connected
		return id[p] == id[q];  
	}
	
	public void union(int p, int q)
	{
		// make connection between two values
	   int pid = id[p];
	   int qid = id[q];
	   for (int i = 0; i < id.length; i++)
		   if (id[i] == pid) id[i] = qid;
	}
	
}
	


