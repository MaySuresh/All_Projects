import java.util.*;

class main {

	public static void main(String[] args) {
		
		// Get all the input.
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int[] vals = new int[n];
		for (int i=0; i<n; i++)
			vals[i] = stdin.nextInt();
			
		// Answer is unassigned.
		int resIdx = -1, temp = -1;
		
		// i represents the day we leave fo the hike.
		for (int i=0; i<n-2; i++) {
			
			// These are our two hiking days.
			int tmp = Math.max(vals[i], vals[i+2]);
			
			// Update if we have no answer or this answer is better.
			if (resIdx == -1 || tmp < temp) {
				resIdx = i+1;
				temp = tmp;
			}
		}
		
		// Ta da!
		System.out.println(resIdx+" "+temp);
	}
}