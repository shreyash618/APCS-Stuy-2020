/* Compilation: javac TilePattern.java
 * Execution: java TilePattern n boolean str
 * Dependencies: Tile-1.png, Tile-2.png, Tile-3.png, Tile-4.png, StdDraw.java
 * 
 * This program creates a recurring pattern of tiles in a n-by-n square. It can
 * create the pattern in a checkerboard fashion, depending on whether or not you
 * provide its boolean arguement with a true or false value. You must specify the
 * first arguement with a integral value n, the number of rows and column in this 
 * pattern. The second argument must be a boolean value, as I explained earlier.
 * Finally, you must also give a third argument, a String which specifies which
 * tile you want the pattern to be. Your options are Tile-1, Tile-2, Tile-3, and
 * Tile-4.
 * 
 * Note: In order for this program to work, you must have all the tile .png files
 * downloaded in the directory of this program and named accordingly to the program
 * (meaning Tile-1.png, Tile-2.png, Tile-3.png and Tile-4.png)
 * 
 */
public class TilePattern {
    public static void main (String [] args) {
        
        int n = Integer.parseInt (args[0]);
        boolean bool = Boolean.parseBoolean (args[1]);
        String tile = args[2];
        
        StdDraw.setScale (0, n);
        // tile pattern without checkerboard
        if (bool == false) {
            for (double i = 0.5; i < (double) n; i = i + 1.0) {
                for (double j = 0.5; j < (double) n; j = j + 1.0)
                    StdDraw.picture (i, j, (tile + ".png"), 1.0, 1.0 );
            }
        }
        
        // checkerboard pattern
        if (bool == true) {
            for (double i = 0.5; i < (double) n; i = i + 2.0) {
                for (double j = 0.5; j < (double) n; j = j + 2.0)
                    StdDraw.picture (i, j , (tile + ".png"), 1.0, 1.0);
            }
            for (double i = 1.5; i < (double) n; i = i + 2.0) {
                for (double j = 1.5; j < (double) n; j = j + 2.0)
                    StdDraw.picture (i, j , (tile + ".png"), 1.0, 1.0);
            }
                
         }
    }
}

            




                
