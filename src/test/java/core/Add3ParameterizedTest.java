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

public class Add3ParameterizedTest {
	@Parameters(name = "Parameter #{index}: {1} + {2} + {3} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{4.0, 1.0, 0.0, 3.0},
			{-1.0, 2.0, -5.0, 2.0},
			{-6.0, -4.0, -4.0, 2.0},
			{-15.0, -6.0, -6.0, -3.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		@Parameter(value=3) public Double third;
		
		@Test
		public void add() {
			System.out.println(first + " + " + second + " + " +third+ " = " + expected);
			assertEquals("Sum of three params returns an incorrect value", 
					Calculator.add(first, second, third), expected, 0.09);		
	}
}
