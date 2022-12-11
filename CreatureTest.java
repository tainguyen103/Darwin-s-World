import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CreatureTest {
	
	Program program = null;
	Creature ctr = new Creature("Hover.txt", 5, 10, 1,"red", program);
	
	@Test
	public void testCreature() {
		assertEquals("Hover.txt", ctr.getSpecies());
		assertEquals(5, ctr.getXPos());
		assertEquals(10, ctr.getYPos());
		assertEquals("right", ctr.getDirection());
		assertEquals("red", ctr.getColor());
		assertEquals(program, ctr.getProgram());
	}

	@Test
	public void testGetDirection() {
		assertEquals("right", ctr.getDirection());
	}

	@Test
	public void testPrint() {
		ctr.print();
	}

	@Test
	public void testGetXPos() {
		assertEquals(5, ctr.getXPos());
	}

	@Test
	public void testGetYPos() {
		assertEquals(10, ctr.getYPos());
	}

	@Test
	public void testGetColor() {
		assertEquals("red", ctr.getColor());
	}

	@Test
	public void testGetSpecies() {
		assertEquals("Hover.txt", ctr.getSpecies());
	}

	@Test
	public void testGetCounter() {
		assertEquals(0, ctr.getCounter());
	}

	@Test
	public void testSetCounter() {
		ctr.setCounter(20);
		assertEquals(20, ctr.getCounter());
	}

	@Test
	public void testGetCurrentInstruction() {
		assertEquals(0, ctr.getCurrentInstruction());
	}

	@Test
	public void testGetProgram() {
		assertEquals(null, ctr.getProgram());
	}

	@Test
	public void testTurnLeft() {
		ctr.turnLeft();
		assertEquals("up", ctr.getDirection());
	}

	@Test
	public void testTurnRight() {
		ctr.turnRight();
		assertEquals("up", ctr.getDirection());
	}

	@Test
	public void testGetXFront() {
		assertEquals(6, ctr.getXFront());
	}

	@Test
	public void testGetYFront() {
		assertEquals(10, ctr.getYFront());
	}

	@Test
	public void testHop() {
		ctr.hop();
		assertEquals(6, ctr.getXPos());
	}

}
