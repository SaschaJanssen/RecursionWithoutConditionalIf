package recursion;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class RekursionTest {

	private Map<Integer, Recursion> recursionMap = new DefaultMap<Integer, Recursion>(new RecursionNext());

	@Before
	public void setUp() {
		recursionMap.put(5, new RecursionExit());

	}

	@Test
	public void testRecursionStopAtFive() throws Exception {
		Recursion rec = new RecursionNext();
		int i = rec.callFun(0, recursionMap);

		assertEquals(5, i);
	}

}
