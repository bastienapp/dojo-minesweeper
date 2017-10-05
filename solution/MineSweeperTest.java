import junit.framework.*;
import org.junit.Test;

public class MineSweeperTest extends TestCase {

	private MineSweeper mineSweeper;

	public MineSweeperTest() {
		int[][] field = {
			{0,0,0,1},
			{0,1,0,1},
			{1,0,0,0},
		};
		mineSweeper = new MineSweeper(field);
	}

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testBoom() throws Exception {
		assertEquals("boom", mineSweeper.sweep(2,0));
	}

	@Test
	public void testMines1() throws Exception {
		assertEquals("3", mineSweeper.sweep(1,2));
	}

	@Test
	public void testMines2() throws Exception {
		assertEquals("2", mineSweeper.sweep(1,0));
	}
}