/******************************************************************************
 *  Compilation:  javac-introcs Tile_2.java
 *  Execution:    java-introcs Tile_2.java
 *  Dependencies: StdDraw.java
 *
 *  Draws a tile with diamonds and rectangles.
 *
 *  % java Tile_2
 *
 ******************************************************************************/
public class Tile_2 {
    public static void main (String [] args) {
        // draws diamond
        StdDraw.clear (StdDraw.BLACK);
        double [] x = {0.5,1.0,0.5,0.0};
        double [] y = {0.0,0.5,1.0,0.5};
        StdDraw.setPenColor (StdDraw.GRAY);
        StdDraw.filledPolygon (x, y);
        // draws 4 individual rectangles     
        StdDraw.setPenColor (StdDraw.WHITE);
        double [] t1 = {0.25,0.375,0.125,0.0};
        double [] t2 = {0.0,0.125,0.375,0.25};
        StdDraw.filledPolygon (t1, t2);
        
        double [] t3 = {0.625,0.75,1.00,0.875};
        double [] t4 = {0.125,0.0,0.25,0.375};
        StdDraw.filledPolygon (t3, t4);
        
        double [] t5 = {0.625, 0.75, 1.00, 0.875};
        double [] t6 = {0.875,1.00,0.75,0.625};
        StdDraw.filledPolygon (t5, t6);
        
        double [] t7 = {0.0,0.125,0.375,0.25};
        double [] t8 = {0.75,0.625,0.875,1.00};
        StdDraw.filledPolygon (t7, t8);
    }
}