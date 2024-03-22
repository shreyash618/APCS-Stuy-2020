/******************************************************************************
 *  Compilation:  javac Checkerboard.java 
 *  Execution:    java Checkerboard n
 *
 *  Plots an n-by-n checkerboard.
 *
 ******************************************************************************/
public class Checkerboard {
    public static void main (String [] args) {
	int n = Integer.parseInt (args[0]);
	int i = 0;
	String text = "";
	while (i < n) {
	    text = "";
	    for (int j = 0; j < n; j++) text = "*" + text;
	    System.out.println (text);
	    i ++;
	}
    }
}