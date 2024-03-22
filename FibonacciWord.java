/******************************************************************************   
 *  Compilation:  javac FibonacciWord.java                                        
 *  Execution: java FibonacciWord                                                 
 *  Prints the Fibonacci word of order 0 through 10. f(0) = "a", f(1) = "b", f(   
 *  2) = "ba", f(3) = "bab", f(4) = "babba", and in general f(n) = f(n-1) follow  
 *  ed by f(n-2).                                                                 
 ******************************************************************************/
public class FibonacciWord {
    public static void main (String [] args) {
        String word0, word1, word2, word3, word4, word5, word6, word7, word8 , word9, word10;
        word0 = "a";
        word1 = "b";
        word2 = word1 + word0;
        word3 = word2 + word1;
        word4 = word3 + word2;
        word5 = word4 + word3;
        word6 = word5 + word4;
        word7 = word6 + word5;
        word8 = word7 + word6;
        word9 = word8 + word7;
	word10 = word9 + word8;

	System.out.println (word0);
        System.out.println (word1);
	System.out.println (word2);
        System.out.println (word3);
	System.out.println (word4);
	System.out.println (word5);
	System.out.println (word6); 
        System.out.println (word7);
        System.out.println (word8);
	System.out.println (word9);
	System.out.println (word10);

    }

}