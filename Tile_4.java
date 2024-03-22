/******************************************************************************
 *  Compilation:  javac-introcs Tile_4.java
 *  Execution:    java-introcs Tile_4.java
 *  Dependencies: StdDraw.java
 *
 *  Draws a tile with diamonds, squares and rectangles.
 *
 *  % java Tile_4
 *
 ******************************************************************************/
public class Tile_4 {
    public static void main (String [] args) {
        // draws diamond
        StdDraw.clear (StdDraw.BLACK);
        double [] x = {0.5,1.0,0.5,0.0};
        double [] y = {0.0,0.5,1.0,0.5};
        StdDraw.setPenColor (StdDraw.GRAY);
        StdDraw.filledPolygon (x, y);
        // draws rectangles
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
        // draws squares overlapping with rectangles
        StdDraw.setPenColor (StdDraw.GRAY);
        double [] tl1 = {0.0,0.25,0.25,0.0};
        double [] tl2 = {0.0,0.0,0.25,0.25};
        StdDraw.filledPolygon (tl1, tl2);
        
        double [] tl3 = {1.0,0.75,0.75,1.0};
        double [] tl4 = {0.0,0.0,0.25,0.25};
        StdDraw.filledPolygon (tl3, tl4);
        
        double [] tl5 = {1.0,0.75,0.75,1.0};
        double [] tl6 = {0.75,0.75,1.0,1.0};
        StdDraw.filledPolygon (tl5, tl6);
        
        double [] tl7 = {0.0,0.25,0.25,0.0};
        double [] tl8 = {0.75,0.75,1.0,1.0};
        StdDraw.filledPolygon (tl7, tl8);
    }
}