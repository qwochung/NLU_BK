package bai6;



/**
 * Develop whatKind method.
The method consumes the coefficients a, b, and c of a quadratic equation.
It then determines whether the equation is degenerate and, if not, how many solutions the equation has.
 The method produces one of four symbols: "degenerate", "two", "one", or "none".

 * @author ADMIN
 *example:
 *
 *		new quadraticEquation(1,2, 30).whatKind() => None
 *		new quadraticEquation(7,1, 0).whatKind() => Two
 */	
public class quadraticEquation {
	double a,b,c ;

	public quadraticEquation(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	
	
	public String whatKind (){
		double delta = Math.pow(b,2) - 4*a*c;
		if (a==0)
			return "degenerate";
		if (delta <0 )
			return "None";
		if (delta > 0 )
			return "Two" ;
		
			
		else return "One";
	}
}
