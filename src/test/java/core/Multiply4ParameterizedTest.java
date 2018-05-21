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

public class Multiply4ParameterizedTest {
	@Parameters(name = "Parameter #{index}: {1} * {2} * {3} * {4} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{100.0, 5.0, 1.0, 2.0, 10.0},
			{0.0, 35.9, 44.2, 24.6, 0.0},
			{-0.0, -35.9, 44.2, -24.6, -0.0},
			{0.0, -0.0, -0.0, 0.0, -0.0},

		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		@Parameter(value=3) public Double third;
		@Parameter(value=4) public Double fourth;
		
		@Test
		public void multiply() {
			System.out.println(first+ " * " +second+ " * " +third+ " * " +fourth+ " = " +expected);
			assertEquals("The multiplying of four params returns an incorrect value", 
					Calculator.multiply(first, second, third, fourth), expected, 0.09);		
	}
}

