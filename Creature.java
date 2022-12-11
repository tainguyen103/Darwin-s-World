import java.io.*;

/**
  * Implements the behavior of Darwin's World Creatures.
  * 
  * @author Tim Wahls
  * @author (Tai Nguyen)
  * @version (September 28th)
*/

public class Creature {
	private String species;
	private String col;
	private int xCoor;
	private int yCoor;
	private int dir;
	private int counter;
	private Program program;


     /** initialize Creature species, color, initial position, direction and
      * program using the parameters, and initialize the program counter to 0.<br>
      * X and Y coordinates default to 1 if parameters are off the world.
      * The horizontal dimensions of the world are from 1 to 21,  
      * and the vertical dimensions are from 1 to 21<br> 
      * direction defaults to 0 ("up") if parameter is not one of 0, 1, 2 or 3
      * The program counter (which keeps track of which instruction in its program
      * the Creature is currently executing) should be initialized to 0 so that
      * the Creature starts executing with the first instruction its program.
      * @param initSpecies the species of the creature
      * @param initX the initial X coordinate
      * @param initY the initial Y coordinate
      * @param initDir the initial direction
      * @param initColor the initial color
      * @param initProgram the initial program
    */ 
    public Creature(String initSpecies, int initX, int initY, int initDir,
                    String initColor, Program initProgram) {
         species  = initSpecies;
         xCoor = initX;
         yCoor = initY;
         dir = initDir;
         col = initColor;
         program = initProgram;
         counter = 0;
    }

    /** 
     * Return the direction of the Creature as one of "up", "down",
     *  "right" or "left".  You can assume that the direction will always
     *  be stored as 0 through 3.  A direction of 0 indicates "up", 1 is "right",
     *  2 is "down" and 3 is "left"
     * @return the direction of the Creature as one of "up", "down",
     *  "right" or "left"
     */
    public String getDirection() {
    	String direction = "";
    	if (dir == 0) {
    		direction = "up";
    	}
    	else if (dir == 1) {
    		direction = "right";
    	}
    	else if (dir == 2) {
    		direction = "down";
    	}
    	else if (dir == 3) {
    		direction = "left";
    	}
        return direction;
    }
  
    /** 
     * Print the species, position, orientation, color and program of the Creature
     * to the terminal window. */
    public void print() { 
        System.out.println("Species: " + species); 
        System.out.println("X coordinate: " + xCoor);  
        System.out.println("Y coordinate: " + yCoor);  
        System.out.println("Color: " + col);  
        System.out.println("Program: " + program);  
    }
  
    /** 
     * Return the X-coordinate of the Creature
     * @return the X-coordinate of the Creature */
    public int getXPos() {
        return xCoor;
    }
    
    /** 
     * Return the Y-coordinate of the Creature
     * @return the Y-coordinate of the Creature */
    public int getYPos() {
        return yCoor;
    }
    
    /** 
     * Return the color of the Creature.
     * @return the color of the Creature.*/
    public String getColor() {
        return col;
    }
    
    /** 
     * Return the species of the Creature
     * @return the species of the Creature */
    public String getSpecies() {
        return species;
    }
    
    /** Return the program counter of this creature
     * @return the program counter of this creature
     */
    
    public int getCounter() {
        return counter;
    }
    
    /** Set the counter of this creature.  If the specified new counter
     * value is not a valid instruction index for this creature's program,
     * display an error message and do not update the counter.
     * @param newValue the new counter value
     */
    public void setCounter(int newValue) {
    	if (newValue >= 0) {
        	counter = newValue;
        } else {
        	System.out.println("Error");
        }
    }
    
    /** get the Instruction that this creature is currently executing.
     * Recall that the program counter keeps track of which instruction the
     * creature is currently executing.  If the program does not contain any
     * instructions, this method should return null.
     * Hint: to test this method, you should call setCounter to set the counter
     * to something other than 0, and then call this method and check that the instruction
     * returned is the expected one.
     * @return the current instruction.
     */
    
    public Instruction getCurrentInstruction() {
    	Instruction ins = program.getInstruction(counter);
    	return ins;
    }
    
    /** Return the program of this creature
     * @return the program of this creature
     */
    public Program getProgram() {
        return program;
    }
    
    /** Turn 90 degrees to the left 
     * @return */
    public void turnLeft() {
        if (dir == 0) {
        	dir = 3;
        } 
        if (dir == 1) {
        	dir = 0;
        }
        if (dir == 2) {
        	dir = 1;
        }
        if (dir == 3) {
        	dir = 2;
        }
    }
    /** Turn 90 degrees to the right */
    public void turnRight() {
        if (dir == 0) {
        	dir = 1;
        } 
        if (dir == 1) {
        	dir = 2;
        }
        if (dir == 2) {
        	dir = 3;
        }
        if (dir == 3) {
        	dir = 0;
        }
    }
  
    /** Return the X-coordinate of the square directly in front of the creature
     *  @return the X-coordinate directly in front of the creature
     */
    public int getXFront() {
    	int xFront = xCoor;
    	if (dir == 1) {
    		xFront = xCoor + 1;
    	}
    	if (dir == 3) {
    		xFront = xCoor - 1;
    	}
    	return xFront;
    }

    /** Return the Y-coordinate of the square directly in front of the creature 
     * @return the Y-coordinate directly in front of the creature
     */
    public int getYFront() {
    	int yFront = yCoor;
    	if (dir == 0) {
    		yFront = yCoor - 1;
    	}
    	if (dir == 2) {
    		yFront = yCoor + 1;
    	}
    	return yFront;
    }

    /** Hop forward.  You can assume that the square in front of the
     *  creature is empty.
     */
    public void hop() {
    	if (dir == 0) {
    		yCoor -= 1;
    	}
    	if (dir == 1) {
    		xCoor += 1;
    	}
    	if (dir == 2) {
    		yCoor += 1;
    	}
    	if (dir == 3) {
    		xCoor -= 1;
    	}
    }
}
