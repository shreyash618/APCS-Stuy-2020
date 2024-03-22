/******************************************************************************
 *  Compilation:  javac GaltonBoard.java
 *  Execution:    java GaltonBoard M n (where M is the number of marbles, and n
 *  the number of columns)
 *  
 *  Simulates the operation of dropping M marbles into a probability board with
 *  N channels along the bottom and k levels of pegs.
 *  The progam displays the number of marbles in each column.
 *
 *  % java GaltonBoard 35 10
 *  would print a table with the number of balls that fell into each column
 *****************************************************************************/
public class GaltonBoard {
    public static void main (String [] args) {
	int M = Integer.parseInt (args [0]); /*Number of marbles*/
	int n = Integer.parseInt (args [1]); /*Number of channels*/
	int k = n - 1; /* Number of pegs vertically */
	
	int [] Channels = new int [n]; /*creates a list of n channels with 0 marbles each */
	for (int marble = 1; marble <= M; marble++) {
	    int R = 0;
	    int L = 0;
	    for (int peg = 1; peg <= k; peg++){
		if (Math.random() >= 0.5) R++;
		else  L++;
	    }
	    int C = R;
	    Channels[C]++;
	}
	System.out.println ("The printed output of dropping " + M + "  marbles into the Galton board with " + n + " channels is: ");
	String [][] arr = new String [n + 2] [2];
	arr [0][0] = "Channel        ";
	arr [0][1] = "Marbles" ;
	arr [1][0] = "---------------";
	arr [1][1] = "---------";
	for (int i = 2; i < n + 2; i++){
	    arr[i][0] = Integer.toString (i - 2) + "              ";
	    arr[i][1] = "";
	    for (int b = 0; b < Channels [i - 2]; b++)
		arr[i][1] = arr[i][1] + "*";
	}
	for (int i = 0; i < n + 2; i ++)
	    System.out.println (arr[i][0] + arr[i][1]);
    }
}