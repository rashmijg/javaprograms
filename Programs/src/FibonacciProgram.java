
public class FibonacciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1 = 0, n2 = 1, n3;
	        
	        // Print first two numbers in Fibonacci sequence
	        System.out.print(n1 + " " + n2 + " ");
	        
	        // Loop to calculate the next 8 Fibonacci numbers
	        for (int i = 2; i < 10; i++) {  // Start from index 2 as first two numbers are already printed
	            n3 = n1 + n2;  // Calculate next Fibonacci number
	            System.out.print(n3 + " ");  // Print the next Fibonacci number
	            n1 = n2;  // Update n1 to the previous Fibonacci number
	            n2 = n3;  // Update n2 to the newly calculated Fibonacci number
		}
		
		
	}

}
