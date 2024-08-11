package BT5_9;

public class MTLoGrade  implements ILoGrade {

	
	
	@Override
	public String toString() {
		return "";
	}

	@Override
	public int howManyCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double  tichDiemSo() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public ILoGrade sortByGradeDec () {
		return new MTLoGrade ();
	}

	
	
	@Override
	public ILoGrade insert(GradeRecord l) {
		
		return new ConsLoGrade(l, new MTLoGrade());
	}

	
	
	
	
	@Override
	public ILoGrade greaterThanList(int num) {
		// TODO Auto-generated method stub
		return new MTLoGrade() ;
	}
	
	
	
	
}
