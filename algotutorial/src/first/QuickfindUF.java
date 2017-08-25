package first;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickfindUF {
	
	private int[] id;
	private int count;
	
	
	public QuickfindUF(int n)
	{
		count = n;
		id = new int[n];
		for (int i = 0; i < n; i++)
		{
			id[i] = i;
		}
	}
	
	
	public int count() {
		return count;
	}
	
	
	public int find(int p) {
		validate(p);
		return id[p];
	}
	
	public void print_id() {
		//display id
		StdOut.print("id    :");
		for(int i=0;i<id.length;i++) {
			StdOut.print(i);
		}
		StdOut.println();
		StdOut.print("value :");
		for(int i=0;i<id.length;i++) {
			StdOut.print(id[i]);
		}
		StdOut.println();
	}
	
	private void validate(int p) {
		int n=id.length;
		if (p<0 || p>= n) {
			throw new IllegalArgumentException("index"+ p + " is not between 0 and "+ (n-1));
			
		}
	}
	
	
	public boolean connected(int p, int q)
	{  
		validate(p);
		validate(q);
		//find if two values are connected
		//StdOut.print(id[p]);
		//StdOut.println(id[q]);
		//return true;
		return id[p] == id[q];  
	}
	
	
	public void union(int p, int q)
	{
		validate(p);
		validate(q);
		
		// make connection between two values
	   int pID = id[p];
	   int qID = id[q];
	   if(pID == qID) return;
	   
	   for (int i = 0; i < id.length; i++)
		   if (id[i] == pID) id[i] = qID;
	   count --;
	}
	
	
	public static void main(String[] args) {
		int n = 10;
		//StdOut.println(n);
		
		QuickfindUF uf = new QuickfindUF(n);
		uf.print_id(); //test code
		StdOut.println();
		
		while (!StdIn.isEmpty())
		{
			int p= StdIn.readInt();
			int q= StdIn.readInt();
			//boolean b = connected(p,q);
			//StdOut.println(b);
			
			if(uf.connected(p, q)) {
				StdOut.println("already connected");
			}
			else {
				uf.union(p, q);
				//StdOut.println(p+" "+q);
				uf.print_id(); //test code
			}
			
			
		}
		StdOut.println(uf.count()+"components");
	}
	
}
	


