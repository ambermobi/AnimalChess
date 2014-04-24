package model;

import java.awt.image.BufferedImage;

import javax.swing.JButton;

/**
 * This is a Chess Piece object
 * @author lianhanloh
 *
 */

public class ChessPiece {
    
    /**
     * class fields
     */
    private boolean selected;
    private boolean alive;
    private Animal animal;
    private boolean team; // true if red, false if black
    /** current x coordinate */
    private int x;
    /** current y coordinate */
    private int y;
    final private BufferedImage img;
    
    public ChessPiece (Animal animal, BufferedImage img, boolean team) {
        this.animal = animal;
        this.img = img;
        this.alive = true;
        this.selected = false;
        this.team = team;
    }
    
    /**
     * highlights chess piece (when it is selected
     */
    
    
    /** selects chess piece */
    public void select() {
        selected = true;
    }
    
    /** captures chess piece */
    public void capture() {
        alive = false;
    }
    
    /** revive piece (for reset purpose) */
    public void revive() {
        this.alive = true;
    }
    
    /** return chess piece's image */
    public BufferedImage getImage () {
        return img;
    }
    
    /** return current x coordinate */
    public int getX() {
        return x;
    }
    
    /** return current y coordinate */
    public int getY() {
        return y;
    }

}
