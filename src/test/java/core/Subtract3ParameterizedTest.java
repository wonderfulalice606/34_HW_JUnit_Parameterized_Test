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

public class Subtract3ParameterizedTest {
	@Parameters(name = "Parameter #{index}: {1} - {2} - {3} = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{3.0, 5.0, 0.0, 2.0},
			{-7.5, -2.0, 4.0, 1.5},
			{8.5, 5.0, -2.0, -1.5},
			{3.5, -4.0, -6.0, -1.5},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		@Parameter(value=3) public Double third;
		
		@Test
		public void subtract() {
			System.out.println(first+ " - " +second+ " - " +third+ " = " +expected);
			assertEquals("The subtracting of three params returns an incorrect value", 
					Calculator.subtract(first, second, third), expected, 0.09);		
	}
}

