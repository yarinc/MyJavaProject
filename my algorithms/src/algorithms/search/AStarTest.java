package algorithms.search;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.mazeGenerators.Position;

public class AStarTest {

	@Test
	public void testSearch() {
		AirDistance air = new AirDistance();
		AStar<Position> aStar = new AStar<>(air);
		assertEquals(null,aStar.search(null));
		
		air = null;
		aStar = new AStar<>(air);
		assertEquals(null,aStar.search(null));
		
		ManhattanDistance manhattan = new ManhattanDistance();
		aStar = new AStar<>(manhattan);
		assertEquals(null,aStar.search(null));
		
		manhattan = null;
		aStar = new AStar<>(manhattan);
		assertEquals(null,aStar.search(null));
	}

}
