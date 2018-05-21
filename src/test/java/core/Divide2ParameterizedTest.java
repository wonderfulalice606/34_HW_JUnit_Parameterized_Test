package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(CategoriesTest.class)

public class Divide2ParameterizedTest {
	@Parameters(name = "Parameter #{index}: {1} / {2} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{3.0, 90.0, 30.0},
			{Double.POSITIVE_INFINITY, 90.0, 0.0},
			{Double.NEGATIVE_INFINITY, 90.0, -0.0},
			{Double.NaN, 0.0, 0.0},

		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		
		@Test
		public void divide() {
			System.out.println(first+ " / " +second+ " = " +expected);
			assertEquals("The dividing of two params returns an incorrect value", 
					Calculator.divide(first, second), expected, 0.09);		
	}
}
