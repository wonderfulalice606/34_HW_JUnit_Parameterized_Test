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

public class CubeRoot3ParameterizedTest {
	@Parameters(name = "Parameter #{index}: The Cube Root of ({1} + {2} +{3}) = {0}")
	public static Collection<Double[]>addNumbers() {
		return Arrays.asList(new Double[][] {
			{3.0, 3.4, 8.6, 15.0},
			{-2.35, -8.0, 0.0, -5.0},
			{-3.0, -3.4, -8.6, -15.0},
			{2.35, 10.0, -6.0, 9.0},
		});}
		@Parameter(value=0) public Double expected;
		@Parameter(value=1) public Double first;
		@Parameter(value=2) public Double second;
		@Parameter(value=3) public Double third;
		
		@Test
		public void cube_root() {
			System.out.println("The Cube Root of (" +first+ " + " +second+ " + " +third+ ")" + " = " +expected);
			assertEquals("The extraction of the cube root of three params returns an incorrect value", 
					Calculator.cube_root(first, second, third), expected, 0.09);		
	}
}

