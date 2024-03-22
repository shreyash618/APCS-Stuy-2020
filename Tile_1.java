/******************************************************************************
 *  Compilation:  javac-introcs Tile_1.java
 *  Execution:    java-introcs Tile_1.java
 *  Dependencies: StdDraw.java
 *
 *  Draws a tile with diamonds and triangles.
 *
 *  % java Tile_1
 *
 ******************************************************************************/

public class Tile_1 {
    public static void main (String [] args) {
        // draws rectangle
        StdDraw.clear (StdDraw.BLACK);
        double [] x = {0.5,1.0,0.5,0.0};
        double [] y = {0.0,0.5,1.0,0.5};
        StdDraw.setPenColor (StdDraw.GRAY);
        StdDraw.filledPolygon (x, y);
        
        // draws 4 individual triangles
        StdDraw.setPenColor (StdDraw.WHITE);
        
        double [] t1 = {0.0,0.25,0.25};
        double [] t2 = {0.25,0.25,0.0};
        StdDraw.filledPolygon (t1,t2);
        
        double [] t3 = {1.00,0.75,0.75};
        double [] t4 = {0.25,0.25,0.00};
        StdDraw.filledPolygon (t3, t4);
        
        double [] t5 = {0.0,0.25,0.25};
        double [] t6 = {0.75,0.75,1.00};
        StdDraw.filledPolygon (t5, t6);
        
        double [] t7 = {1.00,0.75,0.75};
        double [] t8 = {0.75,0.75,1.00};
        StdDraw.filledPolygon (t7, t8);
    }
}