/** represents a position on a board */
public class Coordinate {
    
    /** variables specifying horizontal position on the board */
    private int x;

    /** variable specifying vertical positoin on the board */
    private int y;
    
    /** constructor creating a Coordinate from x and y values */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /** getter for the x value */
    public int getX() {
        return this.x;
    }

    /** getter for the y value */
    public int getY() {
        return this.y;
    }
    
    /** check whether this position is valid for the given (quadratic) board size */
    public boolean checkBoundaries(int xSize, int ySize) {
        // TODO if coordinate x and y <  size x and y IS NOT TESTET
        if ((this.x > xSize || this.x =< 0) && (this.y > ySize || this.y =< 0)){
            return false;
        } else {
            return true;
        }
    }
    
    /** move the position by dx to the right and by dy down */
    public Coordinate shift(int dx, int dy) {
        // TODO IS NOT TESTET
        int tempx = this.x + dx;
        int tempy = this.y + dy;
        Coordinate shifted = new Coordinate(tempx,tempy);
        return shifted;
    }

}

