public class DiceSim {
    public static void main (String [] args) {
	int trials = Integer.parseInt (args[0]);
	int [] FreqL = new int [13];
	for (int i = 0; i <= trials; i++){
	    int dice1 = (int) (6.0 * Math.random() + 1.0);
	    int dice2 = (int) (6.0 * Math.random() + 1.0);
	    int sum = dice1 + dice2;
	    FreqL [sum] ++;
	}
	double [] ProbL = new double [13];
	for (int i = 0; i < 13; i ++){
	    ProbL [i] = 1.0 * FreqL [i] / trials;
	    System.out.println ("Probability of getting a sum of " + i + ":" + ProbL[i]);
	}
    }
}

	    
	    