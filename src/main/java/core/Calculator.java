package core;

public class Calculator {
	
	static double add(double a, double b) {return a + b;}
	static double add(double a, double b, double c) {return a + b + c;}
	static double add(double a, double b, double c, double d) {return a + b + c + d;}
	
	static double divide(double a, double b) {return a / b;}
	static double divide(double a, double b, double c) {return a / b / c;}
	static double divide(double a, double b, double c, double d) {return a / b / c / d;}
	
	static double multiply(double a, double b) {return a * b;}
	static double multiply(double a, double b, double c) {return a * b * c;}
	static double multiply(double a, double b, double c, double d) {return a * b * c * d;}
	
	static double subtract(double a, double b) {return a - b;}
	static double subtract(double a, double b, double c) {return a - b - c;}
	static double subtract(double a, double b, double c, double d) {return a - b - c - d;}
	
	static double root(double a, double b) {return Math.sqrt(a + b);}
	static double root(double a, double b, double c) {return Math.sqrt(a + b + c);}
	static double root(double a, double b, double c, double d) {return Math.sqrt(a + b + c + d);}
	
	static double cube_root(double a, double b) {return Math.cbrt(a + b);}
	static double cube_root(double a, double b, double c) {return Math.cbrt(a + b + c);}
	
	static double power(double a, double b) {return Math.pow(a, b);}
	
	static double maximum(double a, double b) {return Math.max(a, b);}

}
