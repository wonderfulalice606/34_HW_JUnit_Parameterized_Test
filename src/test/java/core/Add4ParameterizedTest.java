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

public class Add4ParameterizedTest {
	@Parameters(name = "Parameter #{index}: {1} + {2} + {3} + {4} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{6.0, 1.0, 3.0, 0.0, 2.0},
			{1.0, -2.0, -0.0, 2.0, 1.0},
			{-5.0, -4.0, -4.0, -2.0, 5.0},
			{-16.0, -6.0, -6.0, -3.0, -1.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		@Parameter(value=3) public Double third;
		@Parameter(value=4) public Double fourth;
		
		@Test
		public void add() {
			System.out.println(first + " + " + second + " + " +third+ " + " +fourth+ " = " + expected);
			assertEquals("Sum of four params returns an incorrect value", 
					Calculator.add(first, second, third, fourth), expected, 0.09);		
	}
}


