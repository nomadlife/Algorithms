import edu.princeton.cs.algs4.StdOut;

public class PercolationStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test client
		int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        
        PercolationStats ps = new PercolationStats(N, T);
        StdOut.println("mean                    = " + ps.mean());
        StdOut.println("stddev                  = " + ps.stddev());
        StdOut.println("95% confidence interval = " + confidence);
        
        
	}
	public PercolationStats(int n, int trials) {
		//perform trials independent experiments on an n-by-n grid
	}
	public double mea() {
		//sample mean of percolation threshold
	}
	public double stddev() {
		//sample standard deviation of percolation threshold
	}
	public double confidenceLo() {
		//low endpoint of 95% confidence interval
	}
	public double congidenceHi() {
		//high endpoint of 95% confidence interval
	}
	

}
