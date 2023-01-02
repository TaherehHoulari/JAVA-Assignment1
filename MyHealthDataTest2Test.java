import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
* @author SeyedehTahereh Houlari
 * @version 1.0
 *
 */
public class MyHealthDataTest2Test {

	private static final double EPSILON = 1E-03;
	/**
	 * The Method under test is {@link MyHealthData#getBMI()}
	 */
	@Test 
			public void testGetBMI() {
			MyHealthData data = new MyHealthData("seyedehTahereh", "Houlari","Female",1987, 2022, 61.811, 125.663);
			double expected =23.100;
		    Assert.assertEquals(expected,data.getBMI() ,EPSILON);
		
		
	}


}
