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
		if (numbers == null || numbers.length < 1) {
			return -1;	
		} else if(!(numbers == null || numbers.length < 1)){
			
			int inputMax = numbers[0];
			int inputMin = numbers[0];
			
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] > inputMax) {
					inputMax = numbers[i];
				}
				
				if(numbers[i] < inputMin) {
					inputMin = numbers[i];
				}
			}
			
			return inputMax - inputMin;
		}
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		} else if(!(numbers == null || numbers.length < 3 || numbers.length % 2 == 0)) {
			for(int a = 0; a < numbers.length; a++) {
				if(numbers[a] < 0){
					return -1;
				}
			}
			
			double firstMax = numbers[0];
			double midMax = numbers[numbers.length/2];
			double lastMax = numbers[numbers.length-1];
			
			if(firstMax > midMax) {
				if(firstMax > lastMax) {
					return firstMax;
				}else if(lastMax > firstMax) {
					return lastMax;
				}
			}else if(midMax > firstMax) {
				if(midMax>lastMax) {
					return midMax;
				}else if(lastMax > midMax) {
					return lastMax;
				}
			}else if(firstMax == midMax && midMax == lastMax) {
				return firstMax;
			}
			
			
		}
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		String[] returnArray = new String[0];
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return returnArray;
		} else if(!(values == null || values.length < 3 || values.length % 2 == 0)) {
			for(int a = 0; a < values.length; a++) {
				if(values[a] == null) {
					return returnArray;
				}
			}
			
			int mid = (values.length-1)/2;
			
			String firstString = values[mid-1];
			String secondString = values[mid];
			String thirdString = values[mid+1];
			
			String[] middleArray = new String[] {firstString,secondString,thirdString};
			
			return middleArray;
		}
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		if (numbers == null || numbers.length < 3) {
			return false;
		} else if(!(numbers == null || numbers.length < 3)) {
			for(int i = 1; i < numbers.length-1; i++) {
				if(numbers[i] == numbers[i-1]-1 && numbers[i] == numbers[i+1]-1) {
					return true;
				}
			}
			
			return false;
		}
		
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
