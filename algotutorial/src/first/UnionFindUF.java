package first;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Weighted QuickUnion

public class UnionFindUF {
	
	private int[] id; // parent link (site indexed)
	private int[] sz; // size of component for roots(site indexed)
	private int count; //number of components
	
	public static void main(String[] args) {
		
		int n = 10;
		UnionFindUF uf = new UnionFindUF(n);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(uf.connected(p, q)) {
				StdOut.println("Already connected!");
			}
			else {
				uf.union(p,q);
				uf.print_id();
			}
		}
				
	}
	
	public UnionFindUF(int N) {
		count = N;
		id = new int[N];
		for (int i=0;i<N;i++) id[i] = i;
		sz = new int[N];
		for (int i=0;i<N;i++) sz[i] = i;
	}
	
	public void print_id() {
		StdOut.print("id   :");
		for(int i=0;i<id.length;i++) {
		StdOut.print(i);
		}
		StdOut.println();
		StdOut.print("value:");
		for(int i=0;i<id.length;i++) {
		StdOut.print(id[i]);
		}
		StdOut.println("");
	}
	
	public int count() {
		return count;
	}
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	private int find(int p) {
		//Follow links to find a root.
		while (p!= id[p]) p= id[p];
		return p;	
	}
	
	public void union(int p, int q) {
		int i = find(p);
		int j = find(q);
		if (i == j) return;
		
		//make smaller root point to larger one.
		if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i];}
		else 				{ id[j] = i; sz[i] += sz[j];}
		count --;
	}
	
}


