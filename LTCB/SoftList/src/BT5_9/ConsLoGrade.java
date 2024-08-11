package BT5_9;

public class ConsLoGrade  implements ILoGrade{
	GradeRecord first;
	ILoGrade rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	
	
	@Override
	public String toString() {
		return  first.toString() +  rest.toString() ;
	}



	@Override
	public int howManyCredit() {
		// TODO Auto-generated method stub
		return this.first.howManyCredit () + this.rest.howManyCredit();
	}



	@Override
	public double tichDiemSo() {
		// TODO Auto-generated method stub
		return this.first.tichDiemSo() + this.rest.tichDiemSo();
	}


	// sap sep
	
	@Override
	public ILoGrade sortByGradeDec() {
	
		return this.rest.sortByGradeDec().insert (first );
	}


	// chen 
	
	@Override
	public ILoGrade insert(GradeRecord l) {
		if ( this.first.getGrade() > l.getGrade() )
			return new ConsLoGrade(l, this);
		else 
			return new ConsLoGrade(this.first, this.rest.insert(l));
		
	}



	
	
	@Override
	public ILoGrade greaterThanList(int num) {
		if ( this.first.getGrade() >= num )
			
			return new ConsLoGrade(first, rest.greaterThanList(num));
		else 
			return this.rest.greaterThanList(num);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
