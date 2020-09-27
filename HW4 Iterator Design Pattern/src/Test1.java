

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test() {


		SalesPeople personA = new SalesPeople("test", "team", 336);

		peopleHolder Testph = new peopleHolder(1);	
		Testph.add(personA);


		peopleIter Testpi = new peopleIter(Testph.getPeople());
		SalesPeople testPerson  = Testpi.next();
		int actual = testPerson.getSalesTotals();
		String testName = "test"; 
		String nameActual = testPerson.getName();

		assertEquals(testName, nameActual);
		assertSame("team", testPerson.getTeam());
		assertEquals(336, actual, "Result of iterator fetch test");


	}

}
