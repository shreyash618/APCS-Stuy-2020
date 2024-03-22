public class ProbabilityObtuseTriangle{

    public static void main(String [] args){
	int trials = Integer.parseInt(args[0]);
	int hits = 0;
	for(int i = 1; i <=  trials; i++){
	    double x = Math.random();
	    double y = Math.random();
	    double z = Math.random();
	    boolean isTriangle = x  + y > z && x + z > y && y + z > x;
	    boolean isObtuseTriangle = false;
	    /*the sum of every two values is larger than the
    third and (ii) the sum of the squares of the two smaller side lengths is less than the square
    of the maximum side length. */

	    if (isTriangle
		&& (( (x + y) > z) &&  ((x + z) > y) && ((y + z) > x))
		&& (((x * x) + (y * y) < (z * z))  || ((x * x) + (z * z) < (y * y))  || ((z * z) + (y * y) < (x * x)))
		)
		{
		    isObtuseTriangle = true;
		    hits = hits + 1;
		}
	    if (trials <= 10){
		System.out.print("trial: " + i + " ");
		System.out.println("x: " + x + "\ty: " + y + "z: " + z);
		System.out.print("ObtuseTriangle?: " + isObtuseTriangle);
   
		System.out.println(" # hits: " +  hits );
	    }
	}
	System.out.println("Final probability: "  +  hits * 1.0 / trials);

    }

}