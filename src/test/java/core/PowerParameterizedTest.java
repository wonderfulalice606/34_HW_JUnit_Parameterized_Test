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

public class PowerParameterizedTest {
	@Parameters(name = "Parameter #{index}: The raising to the {2} power of {1} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{1.0, 1.0, 4.0},
			{0.01, 4.0, -3.0},
			{-27.0, -3.0, 3.0},
			{0.62, 5.0, -0.3},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		
		@Test
		public void power() {
			System.out.println("The raising to the " +second+ " power of " +first+ " = " +expected);
			assertEquals("The raising to the third power returns an incorrect value", 
					Calculator.power(first, second), expected, 0.09);		
	}
}
