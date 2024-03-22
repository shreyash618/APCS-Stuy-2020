public class RandomWalker { 
    public static void main (String[] args) {
	int N = Integer.parseInt (args[0]);
	int T = Integer.parseInt (args[1]);

	int i = 0;
		
	int MovX = 0;
	int MovY = 0;
	
	double sumD2 = 0.0;
	while (i < T) {
	    MovX = 0;
	    MovY = 0;
	    double rand = 4.0  * Math.random();
	    int Rand =  (int) rand;
	    if (Rand == 0) MovX = MovX + N;
	    else if (Rand == 1) MovX = MovX - N;
	    else if (Rand == 2) MovY = MovY + N;
	    else MovY = MovY - N;

	    double DSquared  = Math.pow ( MovX, 2.0) + Math.pow ( MovY, 2.0);
	    sumD2 = sumD2 + DSquared;
	    i++;
	}
	double meanD2 = sumD2 / T;
	System.out.println ("mean distance squared = " + meanD2);
    }
}