public class RandomWalk { 
    public static void main(String[] args) {
	int n = Integer.parseInt (args[0]);
	int MovX = 0;
	int MovY = 0;
	int i = 0;
	while (i < n) {
	double rand = 4.0 * Math.random();
	int Rand =  (int) rand;
	if (Rand == 0) MovX ++;
	else if (Rand == 1) MovX --;
	else if (Rand == 2) MovY ++;
	else MovY --;
	System.out.println ("(" + MovX + "," + MovY + ")");
	i ++;
	}
	double DSquared  = Math.pow ( MovX, 2.0) + Math.pow ( MovY, 2.0);
	System.out.println ("distance squared  = " + DSquared);
    }
}