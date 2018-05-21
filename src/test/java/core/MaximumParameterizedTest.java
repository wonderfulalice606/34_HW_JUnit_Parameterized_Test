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

public class MaximumParameterizedTest {
	@Parameters(name = "Parameter #{index}: The greater value between {1} and {2} is {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{15839.0, 15839.0, 10109.09},
			{10109.09, 10109.09, -15839.0},
			{101.07, 101.07, -0.0},
			{0.0, 0.0, -6.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		
		@Test
		public void maximum() {
			System.out.println("The greater value between " +first+ " and " +second+ " is " +expected);
			assertEquals("The method of two params doesn't return the greater value", 
					Calculator.maximum(first, second), expected, 0.09);		
	}
}
