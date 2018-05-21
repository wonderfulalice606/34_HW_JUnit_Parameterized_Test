package core;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Suite.class)
@SuiteClasses({ Add2ParameterizedTest.class, Add3ParameterizedTest.class, Add4ParameterizedTest.class,
	Divide2ParameterizedTest.class, Divide3ParameterizedTest.class, Divide4ParameterizedTest.class,
	Multiply2ParameterizedTest.class, Multiply3ParameterizedTest.class, Multiply4ParameterizedTest.class,
	Subtract2ParameterizedTest.class, Subtract3ParameterizedTest.class, Subtract4ParameterizedTest.class,
	Root2ParameterizedTest.class, Root3ParameterizedTest.class, Root4ParameterizedTest.class,
	CubeRoot2ParameterizedTest.class, CubeRoot3ParameterizedTest.class, 
	PowerParameterizedTest.class, MaximumParameterizedTest.class })

public class AllTests_Suite {

}
