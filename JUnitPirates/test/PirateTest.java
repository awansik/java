import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testCreatePirate() {
		Pirate p = new Pirate("Davey Jones");
		assertEquals("Davey Jones", p.getName());
		assertEquals(4, p.getLimbsRemaining());
	}

	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate("OctoPete", 8);
		assertEquals(8, p.getLimbsRemaining());
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPirate() {
		Pirate p = null;
		p.loseALimb();
	}
	
	@Test
	public void testIsDead() {
		Pirate p = new Pirate("Dread Pirate Roberts");
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		//4 limbs lost, next one he dies
		assertTrue(p.isDead());
	}



}