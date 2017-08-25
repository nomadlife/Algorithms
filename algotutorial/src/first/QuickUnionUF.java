package first;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		QuickUnionUF uf = new QuickUnionUF(n);
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connected(p, q)) {
				StdOut.println("Already connected!");
			}
			else {
				uf.union(p, q);
				StdOut.print(uf);
			}
				
		}

	}
	private int[] id;
	
	public QuickUnionUF(int N) {
		//constructor
		id = new int[N];
		for (int i =0; i<N ; i++) id[i] =i;
	}
	
	private int root(int i){
		while (i != id[i]) i= id[i];
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}
