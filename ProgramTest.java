import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProgramTest {
	
	@Before 
	public void setUp() throws Exception {
		Program p = new Program();
	}

	@Test
	public void testAddInstruction() {
		
		Program p = new Program();
		
		Instruction ins1 = new Instruction("hop");
		Instruction ins2 = new Instruction("left");
		Instruction ins3 = new Instruction("hit");
		
		p.addInstruction(ins1);
		p.addInstruction(ins2);
		p.addInstruction(ins3);
		
		assertEquals("left", p.getInstruction(1));
	}

	@Test
	public void testGetInstruction() {
		
		Program p = new Program();
		
		Instruction ins1 = new Instruction("hop");
		Instruction ins2 = new Instruction("go");
		Instruction ins3 = new Instruction("hit");
		
		p.addInstruction(ins1);
		p.addInstruction(ins2);
		p.addInstruction(ins3);
		
		assertEquals("left", p.getInstruction(1));
	}

	@Test
	public void testSize() {
		Program p = new Program();
		
		Instruction ins1 = new Instruction("hop");
		Instruction ins2 = new Instruction("go");
		Instruction ins3 = new Instruction("hit");
		
		p.addInstruction(ins1);
		p.addInstruction(ins2);
		p.addInstruction(ins3);
		
		assertEquals(3, p.size());
	}

	@Test
	public void testPrint() {
		Program p = new Program();
		p.print();
	}

}
