/******************************************************************************
 *  Compilation:  javac-introcs Tile_3.java
 *  Execution:    java-introcs Tile_3.java
 *  Dependencies: StdDraw.java
 *
 *  Draws a tile with diamonds and squares.
 *
 *  % java Tile_3
 *
 ******************************************************************************/
public class Tile_3 {
    public static void main (String [] args) {
        // draws diamond
        StdDraw.clear (StdDraw.BLACK);
        double [] x = {0.5,1.0,0.5,0.0};
        double [] y = {0.0,0.5,1.0,0.5};
        StdDraw.setPenColor (StdDraw.GRAY);
        StdDraw.filledPolygon (x, y);
        // draws 4 individual squares     
        StdDraw.setPenColor (StdDraw.WHITE);
        double [] t1 = {0.0,0.25,0.25,0.0};
        double [] t2 = {0.0,0.0,0.25,0.25};
        StdDraw.filledPolygon (t1, t2);
        
        double [] t3 = {1.0,0.75,0.75,1.0};
        double [] t4 = {0.0,0.0,0.25,0.25};
        StdDraw.filledPolygon (t3, t4);
        
        double [] t5 = {1.0,0.75,0.75,1.0};
        double [] t6 = {0.75,0.75,1.0,1.0};
        StdDraw.filledPolygon (t5, t6);
        
        double [] t7 = {0.0,0.25,0.25,0.0};
        double [] t8 = {0.75,0.75,1.0,1.0};
        StdDraw.filledPolygon (t7, t8);
    }
}