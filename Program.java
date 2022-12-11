import java.util.ArrayList;

/** 
 * Darwin's world programs are lists of Instruction objects (contained
 * in an ArrayList).
 * 
 * @author Tim Wahls 
 * @author (Tai Nguyen)
 * @version (PUT DATE HERE) 
 */
   
public class Program {
    private ArrayList<Instruction> progList;

    /** 
     * create an empty program 
     */
    public Program() {
       progList = new ArrayList<Instruction>();
    }

    /** add the specified instruction to the end of the program
      * @param instr the instruction */
    public void addInstruction(Instruction instr) {
        progList.add(instr);
    }
    
    /** get the specified instruction by number.  Note that instructions
     *  are numbered starting from 0.  If the instruction number is invalid,
     *  print an error message and return null.
     *  @param index the instruction to fetch */
    public Instruction getInstruction(int index) {
    	if (index >= 0) {
    		return progList.get(index);
    	} else {
    		System.out.println("Error");
    		return null;
    	}
    }

    /** return the number of instructions in the program
        @return the number of instructions */
    
    public int size() {
        return progList.size();
    }
    
    /** print all instructions in the program to the terminal window.
     *  Note that class Instruction does have a print method of its own.
     */
    public void print() {
    	for (int index=0; index < progList.size(); index++) {
    		progList.get(index).print();
    	}
    }
}
