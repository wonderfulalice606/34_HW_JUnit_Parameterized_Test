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
//@Category(CategoriesTest.class)
@Category(ExcludedCategoryTest.class)

public class Root2ParameterizedTest {
	@Parameters(name = "Parameter #{index}: The Square Root of ({1} + {2}) = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{4.0, 8.0, 8.0},
			{Double.NaN, -8.0, -8.0},
			{2.82, 8.0, 0.0},
			{2.0, 10.0, -6.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		
		@Test
		public void root() {
			System.out.println("The Square Root of (" +first+ " + " +second+ ")" + " = " +expected);
			assertEquals("The extraction of the square root of two params returns an incorrect value", 
					Calculator.root(first, second), expected, 0.09);		
	}
}

