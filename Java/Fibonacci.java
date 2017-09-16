/* Recursive Fibonacci Series Program in Java */
public class Fibonacci {
    
    public static void main(String[] args) 
	{
        
        long limit = 20;
        for(long i =1; i <=limit;i++) 
		{
            System.out.print(fibonacci(i)+", ");
        }
        
        
    }
    
    public static long fibonacci(long n) {
        if(n<=2) 
			return n-1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
}