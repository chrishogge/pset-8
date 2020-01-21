import java.util.Arrays;

public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		// write your code here
		
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		// write your code here
		if (values == null || values.length == 0 || values.length < n || n < 0) {
			String[] returnArray = new String[0];
			return returnArray;
		}else if(!(values == null || values.length == 0 || values.length < n || n < 0)){
			String endsMeet[] = new String[n*2];
			
			for(int i = 0; i < n; i++) {
				endsMeet[i] = values[i];
			}
			
			int k = n;
			for(int j = values.length-n; j < values.length; j++) {
				endsMeet[k] = values[j];
				k++;
			}
			
			return endsMeet;
			
		}
		
		
		String[] returnArray = new String[0];
		return returnArray;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
