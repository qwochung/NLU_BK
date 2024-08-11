package BT5_9;

public interface  ILoGrade {
	public String toString();

	public abstract  int howManyCredit();

	
	public double tichDiemSo () ;
	
	
	// sap sep 
	public ILoGrade sortByGradeDec () ;
	
	
	
	// sắp sếp
	public ILoGrade insert ( GradeRecord l);

	
	
	
	//ktra gia trị cho trước
	
	public ILoGrade greaterThanList(int num);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
