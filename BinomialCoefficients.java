/******************************************************************************
 *  Compilation:  javac BinomialCoefficients.java
 *  Execution:    java BinomialCoefficients n
 * 
 *  Takes an integer command-line argument n and creates a two-dimensional 
 *  ragged array a[][] such that a[n][k] contains the probability of getting    
 *  k-1 heads when tossing a fair coin n-1 times. Uses binomial distribution.
 *
 * 
 *  % java BinomialCoefficients 5
 * 
 *  Pascal's triangle:
 *  1
 *  1 1
 *  1 2 1
 *  1 3 3 1
 *  1 4 6 4 1
 *
 *  Binomial Distribution
 *  1/1
 *  1/2 1/2
 *  1/4 2/4 1/4
 *  1/8 3/8 3/8 1/8
 *  1/16 4/16 6/16 4/16 1/16
******************************************************************************/

public class BinomialCoefficients {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[][] P = new int[n+1][];
        
	P[1] = new int[3];
        P[1][1] = 1;
	
	// prints Pascal's array/triangle
        System.out.println("Pascal's triangle:");
        System.out.println(P[1][1]);
        for (int i = 2; i <= n; i++) {
            P[i] = new int[i+2];
	    // when we initialised the array,  all P[i][0] values were given a value of 0 (along with other elements. Since we start assigning nonzero value for i > 0 and j > 0, P[2][0] will be P[1][0] + P[0][0], which will be 1 + 0. The pattern will go on assigning all indexes in row 1 a value of 1, and hence the algorithm of p[i][j] = p[i-1][j-1] + p[i-j][j] works for all numbers in Pascal's array
            for (int j = 1; j < i + 1; j++){
		P[i][j] = P[i-1][j-1] + P[i-1][j];
		System.out.print(P[i][j] + " ");
		}
            System.out.println();
        }
	System.out.println();
        System.out.println();
        System.out.println("Binomial Distribution");
       
        // prints the binomial numbers
        int d = 1; //the denominator is 2 to the power of (the number of elements in each row - 1)
	// the numerator is the corresponding Pascal value
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < P[i].length - 1; j++) {
                System.out.print(P[i][j] + "/" + d + " ");
            }
            System.out.println();
            d = d * 2;
        }
 
    }

}
