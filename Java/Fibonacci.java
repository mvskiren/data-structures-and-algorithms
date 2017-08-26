/* The Fibonacci sequence is a series where the next term is the sum of pervious two terms
	without recursion */
   
public class Fibonacci{

    static int no = 0, n = 10;        

    public static void main(String[] args) 
	{
      						 // By using function(it prints till 8)
        fib(0, 1);
        }

    public static void fib(int a, int b) {      // passing two parametres as a and b
       						// Terminating condition.
        if (a >= n)
	 {
            return;
         }

      else {
            System.out.print("\t" + no);      
            no = a + b;
            a = b;
            b = no;
            fib(a, b);
            }
    }
} 