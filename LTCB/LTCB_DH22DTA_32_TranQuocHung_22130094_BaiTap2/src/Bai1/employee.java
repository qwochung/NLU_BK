package Bai1;
/**
 * An employee has his name and the number of hours of work.
Determines the wage of an employee from the number of hours of work. Suppose 12 dollars per hour.
Utopia's tax accountants always use programs that compute income taxes even though the tax rate is a solid, never-changing 15%. Determine the  tax on the gross pay.
Also determine netpay of an employee from the number of hours worked base on gross pay and tax . 
Determine the raised wage to $14 for everyone
No employee could possibly work more than 100 hours per week. To protect the company against fraud, the method should check that the hours doesn’t exceed 100. If it does, the method returns false. Otherwise, it returns true

 * @author ADMIN
 *
 */


public class employee {
	String name;
	int hour;
	

	
	public employee(String name, int hour) {
		
		this.name = name;
		this.hour = hour;
	}
	

	/**
	 * Determines the wage of an employee from the number of hours of work.
	 *  Suppose 12 dollars per hour.

	 * @param unit (int) : money per hour
	 * 
	 * @return wage ( double)  : wage of employee
	 * example:
	 * new employee( "hung" , 10) => wage = 120$
	 * new employee ( "ascz" , 20) => wage 240$
	 *  
	 */
	public double wage (int unit) {
		return this.hour*unit;
		
	}


	/*
	 * Utopia's tax accountants always use programs that compute income taxes even though the tax rate is a solid,
	 *  never-changing 15%. Determine the  tax on the gross pay
	 *  muc dich
	 *  input:  unit 
	 *  output:
	 *  
	 *  ex:
	 *  new employee ("asd",10 ).wage(12) * 0.15 => 
	 */
	
	
	public double tax (double unit) {
		return this.wage(12)*unit;
		
	}
	
/**
 * Also determine netpay of an employee from the number of
hours worked base on gross pay and tax
	
	exampe :
	
With salary $240, Nam just receives $204 of netpay

With salary $360, Mai just receives $306 of netpay

With salary $1224, Minh just receives $1020 of netpay
	
 */
	
	public double getNetpay() {
		
		return this.wage(12) - this.tax(0.15);
	}
	
	
	
	
	
	/**
	 * Determine the raised wage to $14 for everyone
	 * example:
	 *
	 * With basic salary $240, after getting bonus,
total income of Nam is $254

	 *With basic salary $360, after getting bonus,
total salary of Mai is $374

	 *With basic salary $1224, after getting bonus,
total salary of Minh is $1238

	 */
	
	
	public double raisedWage (double unit) {
		return this.wage(12) + unit ;
	}
	
	
	
	/**
	 * No employee could possibly work more than 100 hours per week. 
	 * To protect the company against fraud, the method should check that the hours doesn’t exceed 100.
	 * If it does, the method returns false. Otherwise,
	 *  it returns true checkOverTime()
	 *  
	 *  
	 *  Examples:
			It is false that Nam and Mai work 20 and 30 hours per week
			It is true for Minh to work 102 hours per week

	 */
	
	
	public boolean checkOverTime() {
		return this.hour >100;
	}
	
	
	
	
	
	/**
	 * Develop the method tax, which consumes the gross pay and produces the amount of tax owed. 
For a gross pay of $240 or less, the tax is 0%; 
for over $240 and $480 or less, the tax rate is 15%; and for any pay over $480, the tax rate is 28%.

	 * @return
	 * example: 
	 * Employee aEmployee1 = new Employee("Mai", 30);
    	assertEquals(aEmployee1.taxWithRate(), 54.0, 0.001);
    	Employee aEmployee2 = new Employee("Minh", 102);
    	assertEquals(aEmployee2.taxWithRate(), 342.72, 0.001);

	 */
	
	
	
	public double taxWithRate() {
		
		double grosspay = this.wage(12);
		
		if (grosspay <= 240.0)
			return 0.0;
		
		if ( grosspay  <= 480.0)
			return 0.15;
		
		else return 0.28;
			
	}
	
	
	public double netpay() {
//		return this.wage(12) - this.wage(12) * this.taxWithRate();
		double grosspay = this.wage(12);
		return grosspay - grosspay * this.taxWithRate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
