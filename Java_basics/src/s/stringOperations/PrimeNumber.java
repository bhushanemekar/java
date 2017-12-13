package s.stringOperations;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=5;
		
		
		
		printPrime(n);
		
	}
		
		
	public static void printPrime(int end){
		int isPrime;
		 /* Find all Prime numbers between 1 to end */
	    for(int i=2; i<=end; i++)
	    {
	        /* Assume that the current number is Prime */
	        isPrime = 1; 

	        /* Check if the current number i is prime or not */
	        for(int j=2; j<=i/2; j++)
	        {
	            /*
	             * If i is divisible by any number other than 1 and self
	             * then it is not prime number
	             */
	            if(i%j==0)
	            {
	                isPrime = 0;
	                break;
	            }
	        }

	        /* If the number is prime then print */
	        if(isPrime==1)
	        {
	            System.out.println(i);
	        }
	    }
		
		
	}
}
