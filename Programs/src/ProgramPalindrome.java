
public class ProgramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n =121; 
          int sum=0;
          int temp=n;
          int rem=0;
          while(n>0)
          {   
        	  rem=n%10;
        	  sum=(sum*10)+rem;
        	  n=n/10;
          }
          if(sum==temp)
          {
        	 System.out.println("number is palindrome");
          }
        	  
 	}

}
