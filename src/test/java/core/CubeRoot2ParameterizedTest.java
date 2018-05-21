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

public class CubeRoot2ParameterizedTest {
	@Parameters(name = "Parameter #{index}: The Cube Root of ({1} + {2}) = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{3.0, 21.5, 5.5},
			{-2.0, -8.0, 0.0},
			{-3.0, -8.0, -19.0},
			{1.59, 10.0, -6.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		
		@Test
		public void cube_root() {
			System.out.println("The Cube Root of (" +first+ " + " +second+ ")" + " = " +expected);
			assertEquals("The extraction of the cube root of two params returns an incorrect value", 
					Calculator.cube_root(first, second), expected, 0.09);		
	}
}

