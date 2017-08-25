package first;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Quickfind {
	
	public void QuickFind(int N)
	{
		id = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i;
			StdOut.println(id[i]);
		}
	}
	
	private static int[] id;
	
	//boolean b = connected(1,2);
	
	public static boolean connected(int p, int q)
	{  
		//find if two values are connected
		StdOut.println(id[p]);
		StdOut.println(id[q]);
		return true;
		//return id[p] == id[q];  
	}
	
	public static void union(int p, int q)
	{
		// make connection between two values
	   int pid = id[p];
	   int qid = id[q];
	   for (int i = 0; i < id.length; i++)
		   if (id[i] == pid) id[i] = qid;
	}
	
	public static void main(String[] args) {
		
		//int N = 10;
		//StdOut.println(N);

		
		//UF uf = new UF(N);
		while (!StdIn.isEmpty())
		{
			int p= StdIn.readInt();
			int q= StdIn.readInt();
			boolean b = connected(p,q);
			StdOut.println(b);
			
			/*
			if(!connected(p, q))
			{
				union(p, q);
				StdOut.println(p+" test "+q);
			}
			*/
		}
	}
	
	
	
}
	


